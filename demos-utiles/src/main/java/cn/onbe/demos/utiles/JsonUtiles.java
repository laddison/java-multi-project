package cn.onbe.demos.utiles;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * json工具类 fastjson
 * @author LiQiuShui
 */
public class JsonUtiles {

    /**
     * json字符串转map集合
     * @param jsonStr json字符串
     * @return HashMap<String, String>
     */
    public static HashMap<String, String> json2Map(String jsonStr){
        return JSON.parseObject(jsonStr, new HashMap<String, String>().getClass());
    }

    /**
     * map转json字符串
     * @param map Map<String, String>
     * @return String
     */
    public static String map2Json(Map<String, String> map){
        String jsonStr = JSON.toJSONString(map);
        return jsonStr;
    }

    /**
     * json字符串转换成对象
     * @param jsonString String
     * @param cls Class
     * @return T
     */
    public static <T> T json2Bean(String jsonString, Class<T> cls){
        T t = null;
        try {
            t = JSON.parseObject(jsonString,cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 对象转换成json字符串
     * @param obj Object
     * @return String
     */
    public static String bean2Json(Object obj){
        return JSON.toJSONString(obj);
    }

    /**
     * json字符串转换成List集合
     * (需要实体类)
     * @param jsonString String
     * @return List
     */
    public static <T> List<T> json2List(String jsonString, Class cls){
        List<T> list = null;
        try {
            list = JSON.parseArray(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * json字符串转换成ArrayList集合
     * (需要实体类)
     * @param jsonString String
     * @return ArrayList
     */
    public static <T> ArrayList<T> json2ArrayList(String jsonString, Class cls){
        ArrayList<T> list = null;
        try {
            list = (ArrayList<T>) JSON.parseArray(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * List集合转换成json字符串
     * @param obj Object
     * @return String
     */
    public static String list2Json(Object obj){
        return JSONArray.toJSONString(obj, true);
    }

    /**
     * json转List
     * (不需要实体类)
     * @param jsonStr String
     * @return JSONArray
     */
    public static JSONArray json2List(String jsonStr){
        return JSON.parseArray(jsonStr);
    }
}
