//
// Created by 鑫冯 on 2021/9/5.
//
#include "android/log.h"

#define TAG "NativeAuth"
#define    LOGI(...)       __android_log_print(ANDROID_LOG_INFO, TAG, __VA_ARGS__)
#define    LOGD(...)      __android_log_print(ANDROID_LOG_DEBUG, TAG, __VA_ARGS__)
#define    LOGE(...)      __android_log_print(ANDROID_LOG_ERROR, TAG, __VA_ARGS__)
#define    LOGW(...)      __android_log_print(ANDROID_LOG_WARN, TAG, __VA_ARGS__)
#define    LOGF(...)      __android_log_print(ANDROID_LOG_FATAL, TAG, __VA_ARGS__)