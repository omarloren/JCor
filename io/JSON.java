
package io;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;

/**
 * Wrapper para manejar objectos JSON usando simple JSON's, pero aún más fácil.
 * @author omar
 */
public class JSON {
    public static String HashToJson( HashMap<String, Object> hm){
        JSONObject r = new JSONObject();
        for (Map.Entry e : hm.entrySet()) {
            r.put(e.getKey(), e.getValue());
        }
        return r.toJSONString();
    }
}
