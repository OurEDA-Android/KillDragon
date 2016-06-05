package com.example.means88.test;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Means88 on 2016/6/4.
 */
public class DataManager {

    public static String getFailureCase() {
        return "{\"success\": false, \"msg\": null}";
    }

    public static String getSuccessCase() {
        return "{\"success\": true, \"msg\": {\"id\": 0, \"detail\": \"success\"}}";
    }

    public static Message getMsg(String json) throws JSONException {
        JSONObject object = new JSONObject(json);
        JSONObject msg = object.getJSONObject("msg");
        Message message = new Message();
        message.setId(msg.getInt("id"));
        message.setDetail(msg.getString("detail"));
        return message;
    }
}
