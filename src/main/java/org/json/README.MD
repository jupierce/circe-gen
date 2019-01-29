Minor patch to org.json

1) unzip .m2/repository/org/json/json/20180813/json-20180813-sources.jar
2) in JSONObject.populateMap, directly before invoking method, setAccessible(true)

This allows the consumer of this library to create and return anonymous classes
to satisfy interfaces. The reason this step is required is because an anonymous
class is protected by default and reflection is not allowed to invoke the method.

Setting accessible clears this hurdle. 
