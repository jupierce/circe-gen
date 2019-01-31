package com.redhat.openshift.cr.config.impl.project;

import com.redhat.openshift.circe.gen.ProjectDefinition;
import com.redhat.openshift.cr.config.core.BaseObject;
import com.redhat.openshift.circe.gen.impl.ObjectMeta;
import com.redhat.openshift.circe.gen.project.Project;
import com.redhat.openshift.circe.gen.project.ProjectSpec;
import com.redhat.openshift.circe.gen.project.TemplateReference;
import com.redhat.openshift.circe.gen.template.Parameter;
import com.redhat.openshift.circe.gen.template.Template;
import com.redhat.openshift.cr.config.core.AbstractDefinition;
import com.redhat.openshift.cr.config.core.ClusterCriterion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ClusterCriterion(type = ClusterCriterion.ClusterType.ONLINE_STARTER)
public class BaseProjectDefinition extends AbstractDefinition implements ProjectDefinition {

    public BaseProjectDefinition(
            ClusterCriterion.ClusterType type,
            ClusterCriterion.ClusterEnvironment env,
            String name,
            Map<String, String> attributes) {
        super(type, env, name, attributes);
    }

    @Override
    public Project getProject() {
        return new Project() {
            @Override
            public ProjectSpec getSpec() {
                return new ProjectSpec() {
                    @Override
                    public String getProjectRequestMessage() {
                        return "You requested a new project";
                    }

                    @Override
                    public TemplateReference getProjectRequestTemplate() {
                        return new TemplateReference() {
                            @Override
                            public String getName() {
                                return "openshift-config/project-request";
                            }
                        };
                    }
                };
            }
        };
    }

    @Override
    public Template getTemplate() {
        return new Template() {
            @Override
            public String getMessage() {
                return "Cluster Project Request Template";
            }

            @Override
            public List<Parameter> getParameters() {
                List<Parameter> params = new ArrayList<>();
                for ( String paramName : new String[]{
                        "PROJECT_NAME",
                        "PROJECT_DISPLAYNAME",
                        "PROJECT_DESCRIPTION",
                        "PROJECT_ADMIN_USER",
                        "PROJECT_REQUESTING_USER"
                }) {
                    params.add(new SimpleParameter(paramName));
                }
                return params;
            }

            @Override
            public List<BaseObject> getObjects() {
                List<BaseObject> objects = new ArrayList<>();

                Map<String,Object> projectAnnotations = new HashMap<String, Object>();

                projectAnnotations.put("openshift.io/description", "${PROJECT_DESCRIPTION}");
                projectAnnotations.put("openshift.io/display-name", "${PROJECT_DISPLAYNAME}");
                projectAnnotations.put("openshift.io/requester", "${PROJECT_REQUESTING_USER}");

                // Create the actual project as part of the request
                objects.add(new BaseObject("v1", "Project",
                        new ObjectMeta(
                                null,
                                "${PROJECT_NAME}",
                                null,
                                projectAnnotations
                        )) {

                });



                return objects;
            }

            @Override
            public Map<String, String> getObjectLabels() {
                return null;
            }
        };
    }
}
