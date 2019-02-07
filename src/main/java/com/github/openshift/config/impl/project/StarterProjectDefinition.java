package com.github.openshift.config.impl.project;

import com.github.openshift.circe.gen.def.v4_0.ProjectConfigDefinition;
import com.github.openshift.circe.gen.project.v1.Project;
import com.github.openshift.circe.gen.project.v1.ProjectSpec;
import com.github.openshift.circe.gen.project.v1.TemplateReference;
import com.github.openshift.circe.gen.template.v1.Template;
import com.github.openshift.circe.yaml.YamlProvider;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.AbstractDefinition;

import java.io.IOException;


@ClusterCriterion(type = ClusterCriterion.ClusterType.ONLINE_STARTER)
public class StarterProjectDefinition extends AbstractDefinition implements ProjectConfigDefinition {

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
    public Template getTemplate() throws IOException {
        return (Template)YamlProvider.buildFor(this.readResourceFile("starter-project-request-template.yaml"), Template.class);
    }
}
