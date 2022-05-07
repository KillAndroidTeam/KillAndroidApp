package com.kan.note.s.airthmtic.jni;

/**
 * @author FengXin
 * @description:
 * @date :2022/5/7 9:16
 */
public class JniUtils {
    public static native String stringFromJNI();

    public static native String testDem1();

    static {
        System.loadLibrary("myjnitestapp");
    }
}
