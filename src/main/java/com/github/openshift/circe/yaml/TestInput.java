package com.github.openshift.circe.yaml;

import java.util.HashMap;
import java.util.Map;

import static com.github.openshift.circe.beans.Quantity.Unit.M;

public class TestInput {

    public static interface I {
        public String getSomeIValue();
    }

    public static class MB1 extends MapBean<Integer> {
        public Integer getEntry1() { return 1; }
        public Integer getEntry2() { return 2; }
        public Integer getEntry3() { return 3; }
    }

    public static class MB2 extends MB1 {
        public Integer getEntry4() { return 4; }
        public Integer getEntry5() { return 5; }
        @RenderOrder("aaa") // make this the first in the rendered map
        public Integer getEntry3() { return 300; }
    }


    public static class LB1 extends ListBean<Integer> {
        public Integer getEntry1() { return 1; }
        public Integer getEntry2() { return 2; }
        public Integer getEntry3() { return 3; }
    }

    public static class LB2 extends LB1 {
        public Integer getEntry4() { return 4; }
        public Integer getEntry5() { return 5; }
        @RenderOrder("aaa") // make this the first in the rendered list
        public Integer getEntry3() { return 300; }
    }

    public static class Z {

        public int getZVal() {
            return 6;
        }
        protected boolean getZBool() {
            return false;
        }
        public String getZSimpleString() {
            return "Z: this is a simple String";
        }

        public String getZComplexString() {
            return "   <]Z: this is a \"complex\" String\nwith multiple\nlines and\n     <]preceding space and\na line with only space and ended by newline\n   \n";
        }

        public YamlProvider getFreeFormPrimitive() {
            return new YamlProvider() {
                @Override
                public String toYaml() {
                    return "5";
                }
            };
        }

        public YamlProvider getFreeFormList() {
            return new YamlProvider() {
                @Override
                public String toYaml() {
                    return "- 1\n- 2\n- 3\n";
                }
            };
        }

        public I getThisWouldBeI() {
            return (I)YamlProvider.buildFor("somethingCompletelyDifferent: 3", I.class);
        }


    }


    public static class Y {

        public int getYVal() {
            return 5;
        }
        public boolean getYBool() {
            return true;
        }
        public String getYSimpleString() {
            return "Y: this is a simple String";
        }

        public Z getZ() {
            return new Z();
        }

    }

    public static class R {
        public int getRVal() {
            return 50;
        }
    }

    public static class X extends Z {

        public Map<String, Integer> getSimpleMap() {
            HashMap<String, Integer> sm = new HashMap<>();
            sm.put("this_is_1", 1);
            sm.put("this_is_2", 2);
            sm.put("this_is_3", 3);
            return sm;
        }

        public ListBean<Integer> getLb1() { return new LB1(); }

        public ListBean<Integer> getLb2() { return new LB2(); }

        public MapBean<Integer> getMb1() { return new MB1(); }

        public MapBean<Integer> getMb2() { return new MB2(); }


        public int getVal() {
            return 5;
        }

        public R getR() {
            return new R();
        }

        public boolean getBool() {
            return true;
        }

        public String getSimpleString() {
            return "X: this is a simple String";
        }

        public Y getY() {
            return new Y();
        }

        public int[] getXInts() {
            return new int[]{ 1, 2, 3, 4, 5 };
        }

        public Y[] getYs() {
            return new Y[]{ new Y(), new Y() };
        }

        public Z[] getZs() {
            return new Z[]{ new Z(), new Z() };
        }

        @YamlLiteralNullValue
        public String getThisShouldBeNull() {
            throw new UnsupportedOperationException();
        }

    }

    public static void main(String[] args ) {
        System.out.println((new YamlDumper(YamlDumper.Verbosity.SHOW_ALL_SOURCE)).toString(new TestInput.X()));
    }

}
