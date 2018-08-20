package com.example.ling.beijingnews.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author ling
 * @des
 * @updateAuthor
 * @updataDes
 */
public class CacheUtil {


    public static boolean getBoolean(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences("ling",Context.MODE_PRIVATE);


        return sp.getBoolean(key,false);
    }
}
