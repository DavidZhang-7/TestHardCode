package com.myapple.testhardcode;

class JNIUtils {
    static {
        System.loadLibrary("hardcode-lib");
    }

    public native String[] loadStringArrayFromSoFileJNI();

}
