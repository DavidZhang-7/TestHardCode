cmake_minimum_required(VERSION 3.4.1)

add_library(hardcode-lib SHARED src/main/jni/com_myapple_testhardcode_JNIUtils.cpp)

# Link any additional libraries here if needed

find_library(log-lib log)

target_link_libraries(hardcode-lib ${log-lib})
