package com.github.openshift.config.impl.project;

import com.github.openshift.config.impl.AbstractDefinition;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.circe.gen.ProjectConfigDefinition;
import com.github.openshift.circe.gen.project.Project;
import com.github.openshift.circe.gen.project.ProjectSpec;
import com.github.openshift.circe.gen.project.TemplateReference;
import com.github.openshift.circe.gen.template.Template;
import com.github.openshift.circe.yaml.YamlProvider;

import java.io.IOException;
import java.util.Map;


@ClusterCriterion(type = ClusterCriterion.ClusterType.ONLINE_STARTER)
public class StarterProjectDefinition extends AbstractDefinition implements ProjectConfigDefinition {

    public StarterProjectDefinition(
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
    public Template getTemplate() throws IOException {
        return (Template)YamlProvider.buildFor(this.readResourceFile("starter-project-request-template.yaml"), Template.class);
    }
}
