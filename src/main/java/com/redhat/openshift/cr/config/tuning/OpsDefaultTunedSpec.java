package com.redhat.openshift.cr.config.tuning;

import com.redhat.openshift.circe.gen.tuned_types.TunedMatch;
import com.redhat.openshift.circe.gen.tuned_types.TunedProfile;
import com.redhat.openshift.circe.gen.tuned_types.TunedRecommend;
import com.redhat.openshift.circe.gen.tuned_types.TunedSpec;

import java.util.Arrays;
import java.util.List;

public class OpsDefaultTunedSpec implements TunedSpec {

    @Override
    public List<TunedProfile> getProfile() {
        TunedProfile[] profiles = {
          new TunedProfile() {

              @Override
              public String getName() {
                  return "profile1";
              }

              @Override
              public String getData() {
                  return "This is my tuned data";
              }
          }
        };
        return Arrays.asList(profiles);
    }

    @Override
    public List<TunedRecommend> getRecommend() {
        TunedRecommend[] recommend = {
                new TunedRecommend() {
                    @Override
                    public String getProfile() {
                        return "profile1";
                    }

                    @Override
                    public Long getPriority() {
                        return new Long(55);
                    }

                    @Override
                    public List<TunedMatch> getMatch() {
                        TunedMatch[] matches = {
                                new TunedMatch() {
                                    @Override
                                    public String getLabel() {
                                        return "somelabel";
                                    }

                                    @Override
                                    public String getValue() {
                                        return "65";
                                    }

                                    @Override
                                    public String getType() {
                                        return "sometype";
                                    }

                                    @Override
                                    public List<TunedMatch> getMatch() {
                                        return null;
                                    }
                                }
                        };
                        return Arrays.asList(matches);
                    }
                }
        };

        return Arrays.asList(recommend);
    }
}
