//
// Created by Apple on 2023/9/7.
//

#include <jni.h>
#include <string>
#include <vector>
#include "com_myapple_testhardcode_JNIUtils.h"

extern "C" {
JNIEXPORT jobjectArray JNICALL
Java_com_myapple_testhardcode_JNIUtils_loadStringArrayFromSoFileJNI(JNIEnv *env, jobject instance) {
        // Create a C++ vector to hold the string items
        std::vector<std::string> items;

        // Add some sample
        // items (you should load these from your SO file)
        items.push_back("Amazon_AWS_Access_Key_ID1: ASIA1234567890ABCDE");
        items.push_back("Artifactory_API_Token: AKC1a2b3C4d5E6f7G8h9I0");
        items.push_back("Artifactory_Password1: basic ABC123:456=789_-=.");
        items.push_back("Artifactory_Password2: basic example:secret_key");
        items.push_back("Authorization_Bearer: bearer ABC123:jwt_token");
        items.push_back("AWS_API_Key: AKIA1234567890ABCDE");
        items.push_back("Cloudinary_Basic_Auth: cloudinary://123456789012345:abcdefg@api.cloudinary.com");
        items.push_back("Discord_BOT_Token: Nabcdefghijklmno1234567890123.xYzAbCdEfG1234567890123456789");
        items.push_back("Facebook_Access_Token: EAACEdEose0cBAabcdefghijklmnopqrstuvwxyz1234567890");
        items.push_back("Facebook_OAuth: FacebookOAuth_'fb1234567890abcdef1234567890abcdef'");
        items.push_back("Facebook_Secret_Key: Facebookfbxxx_'fb1234567890abcdef1234567890'");
        items.push_back("Generic_API_Key: ApiKey1234567890'abcdefghijklmnopqrstuv'");
        items.push_back("Generic_Secret: Secret_Key_'1234567890abcdefghijklmnopqrstuvwxyz'");
        items.push_back("GitHub_Access_Token: GitHub_User123:GitHub_Token987654321@github.com");
        items.push_back("Google_API_Key: AIzaAbCdEfGhIjKlMnOpQrStUvWxYz0123456789");
        items.push_back("Google_Cloud_Platform_OAuth: 1234567890-abcdefghijklmnopqrstuvwxyz_ABCD1234.apps.googleusercontent.com");
        items.push_back("Google_OAuth_Access_Token: ya29.AbcDefgH1234567890-abcdefghijklmnopqrstuvwxyz_ABCD1234");
        items.push_back("Firebase Database1: subdomain1.firebaseio.com");
        items.push_back("Firebase Database2: subdomain2.firebasedatabase.app");
        items.push_back("HMAC_KEY1: HMAC-SHA256-KEY = 'my_secret_key'");
        items.push_back("HMAC_KEY2: HMAC_MD5_KEY = \"another_secret_key\"");
        items.push_back("Heroku_API_Key: Heroku1234-abcd5678efgh1234ijkl5678mnop1234");
        items.push_back("MailChimp_API_Key: 12345678901234567890123456789012-us1");
        items.push_back("Mailgun_API_Key: key-abcdefghijklmnopqrstuvwxyz012345");
        items.push_back("PayPal_Braintree_Access_Token: access_token$production$abcdefghijklmnop$0123456789abcdef0123456789abcdef");
        items.push_back("PGP_private_key_block: -----BEGIN PGP PRIVATE KEY BLOCK-----");
        items.push_back("Picatic_API_Key: sk_live_1234567890abcdefghijklmnopqrstuvwxyz");
        items.push_back("RSA_Private_Key: -----BEGIN RSA PRIVATE KEY-----");
        items.push_back("Slack_Token: xoxp-123456789012-123456789012-123456789012-abcdefghijklmnopqrstuvwxyz01234567");
        items.push_back("Square_Access_Token: sq0atp-AbCdEfGhIjKlMnOpQrStUvWxYz-1234567890AbCdEfGhIjKlMnOpQrStUvWxYz");
        items.push_back("Square_OAuth_Secret: sq0csp-AbCdEfGhIjKlMnOpQrStUvWxYz-1234567890AbCdEfGhIjKlMnOpQrStUvWxYz");
        items.push_back("SSH_DSA_Private_Key: -----BEGIN DSA PRIVATE KEY-----");
        items.push_back("SSH_EC_Private_Key: -----BEGIN EC PRIVATE KEY-----");
        items.push_back("Stripe_API_Key: sk_live_abcdefghijklmnopqrstuvwxyz1234");
        items.push_back("Stripe_Restricted_API_Key: rk_live_abcdefghijklmnopqrstuvwxyz1234");
        items.push_back("Twilio_API_Key: SK0123456789abcdef0123456789abcdef");
        items.push_back("Twitter_Access_Token: twitterAccessToken12345-abcdefghijklmnopqrstuvwxyz1234567890abcdefghijklmnopqrstuvwxyz");
        items.push_back("Twitter_OAuth: twitter: \"tw1234567890abcdefghij12345\"");
        items.push_back("Twitter_Secret_Key: TwitterSecretKey1234567890abcdefghijklmnopqrstuvw");
        items.push_back("AES_KEY: AESKey = \"ThisIsAESKey123456\"");
        items.push_back("AES_IV: AESIv = \"0123456789abcdef\"");
        items.push_back("password: password= \"12345!@#\"");
        items.push_back("WIFI_KEY: WIFI_KEY= \"WIFI_Password!@#\"");
        items.push_back("DEFAULT_LOCK: password= DEFAULT_LOCK = \"12345\"");
        items.push_back("Find_HTTP1: http://www.example.com");
        items.push_back("Find_HTTP2: https://www.example.com");
        items.push_back("API_KEY: API_KEY = \"MyAPIKey123\"");
        items.push_back("JWT: eyJ1c2VybmFtZSI6ImpvaG4gZG9lIiwicGFzc3.aW5nZXN0aW9uX19fX2VxdWlwbWVudF9fX3NhbGVzX19fX3JlcXVlc3RlZF9fX2F.aW5nZXN0aW9uX19fX2VxdWlwbWVudF9fX3NhbGVzX19fX3JlcXVlc3RlZF9fX2F");
        items.push_back("SQLITE_PASSWORD: SQLITE_PASSWORD = \"SQLitePassword!@#\"");
        items.push_back("alipay_rsaprivatekey: <string name=\"alipay_rsaprivatekey\">ThisIsAlipayPrivateKey</string>");
        items.push_back("WECHAT_SECRET: WECHAT_SECRET = \"WeChatSecret!@#\"");
        items.push_back("mail: test.user@sub.example.com");
        items.push_back("AliyunOSS: https://fake-bucket.oss-cn-hangzhou.aliyuncs.com/fake-folder/fake-file.jpg");
        items.push_back("HuaweiOBS: https://fake-bucket.obs.ap-southeast-1.myhuaweicloud.com/fake-folder/fake-file.jpg");
        items.push_back("Amazon S3 OSS: https://s3.amazonaws.com/my-bucket/my-folder/my-file.txt");
        items.push_back("Amazon S3 OSS false: https://s3.amazonaws.com/my-file.txt");
        items.push_back("Google Cloud Storage: https://storage.googleapis.com/my-bucket/my-folder/my-file.txt");
        items.push_back("Microsoft Azure Blob Storage: https://mystorageaccount.blob.core.windows.net/my-container/my-folder/my-file.txt");


    // Convert the C++ vector to a Java string array
        int size = items.size();
        jclass stringClass = env->FindClass("java/lang/String");
        jobjectArray stringArray = env->NewObjectArray(size, stringClass, nullptr);
        for (int i = 0; i < size; i++) {
        jstring item = env->NewStringUTF(items[i].c_str());
        env->SetObjectArrayElement(stringArray, i, item);
        env->DeleteLocalRef(item);
        }

        return stringArray;
    }
}
