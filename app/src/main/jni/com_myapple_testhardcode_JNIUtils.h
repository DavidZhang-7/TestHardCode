//
// Created by Apple on 2023/9/7.
//
#include <jni.h>
#ifndef com_myapple_testhardcode_JNIUtils
#define com_myapple_testhardcode_JNIUtils

extern "C" {
JNIEXPORT jobjectArray JNICALL
Java_com_myapple_testhardcode_JNIUtils_loadStringArrayFromSoFileJNI(JNIEnv *env, jobject instance);
}

#endif //TESTHARDCODE_HARDCODE_LIB_H
