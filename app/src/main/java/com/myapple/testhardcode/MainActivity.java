package com.myapple.testhardcode;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] stringArrayFromJava = {
            "++++++++++++++++++++++++",
            "Amazon_AWS_Access_Key_ID1: ASIA1234567890ABCDE",
            "Artifactory_API_Token: AKC1a2b3C4d5E6f7G8h9I0",
            "Artifactory_Password1: basic ABC123:456=789_-=.",
            "Artifactory_Password2: basic example:secret_key",
            "Authorization_Bearer: bearer ABC123:jwt_token",
            "AWS_API_Key: AKIA1234567890ABCDE",
            "Cloudinary_Basic_Auth: cloudinary://123456789012345:abcdefg@api.cloudinary.com",
            "Discord_BOT_Token: Nabcdefghijklmno1234567890123.xYzAbCdEfG1234567890123456789",
            "Facebook_Access_Token: EAACEdEose0cBAabcdefghijklmnopqrstuvwxyz1234567890",
            "Facebook_OAuth: FacebookOAuth_'fb1234567890abcdef1234567890abcdef'",
            "Facebook_Secret_Key: Facebookfbxxx_'fb1234567890abcdef1234567890'",
            "Generic_API_Key: ApiKey1234567890'abcdefghijklmnopqrstuv'",
            "Generic_Secret: Secret_Key_'1234567890abcdefghijklmnopqrstuvwxyz'",
            "GitHub_Access_Token: GitHub_User123:GitHub_Token987654321@github.com",
            "Google_API_Key: AIzaAbCdEfGhIjKlMnOpQrStUvWxYz0123456789",
            "Google_Cloud_Platform_OAuth: 1234567890-abcdefghijklmnopqrstuvwxyz_ABCD1234.apps.googleusercontent.com",
            "Google_OAuth_Access_Token: ya29.AbcDefgH1234567890-abcdefghijklmnopqrstuvwxyz_ABCD1234",
            "Firebase Database1: subdomain1.firebaseio.com",
            "Firebase Database2: subdomain2.firebasedatabase.app",
            "HMAC_KEY1: HMAC-SHA256-KEY = 'my_secret_key'",
            "HMAC_KEY2: HMAC_MD5_KEY = \"another_secret_key\"",
            "Heroku_API_Key: Heroku1234-abcd5678efgh1234ijkl5678mnop1234",
            "MailChimp_API_Key: 12345678901234567890123456789012-us1",
            "Mailgun_API_Key: key-abcdefghijklmnopqrstuvwxyz012345",
            "PayPal_Braintree_Access_Token: access_token$production$abcdefghijklmnop$0123456789abcdef0123456789abcdef",
            "PGP_private_key_block: -----BEGIN PGP PRIVATE KEY BLOCK-----",
            "Picatic_API_Key: sk_live_1234567890abcdefghijklmnopqrstuvwxyz",
            "RSA_Private_Key: -----BEGIN RSA PRIVATE KEY-----",
            "Slack_Token: xoxp-123456789012-123456789012-123456789012-abcdefghijklmnopqrstuvwxyz01234567",
            "Square_Access_Token: sq0atp-AbCdEfGhIjKlMnOpQrStUvWxYz-1234567890AbCdEfGhIjKlMnOpQrStUvWxYz",
            "Square_OAuth_Secret: sq0csp-AbCdEfGhIjKlMnOpQrStUvWxYz-1234567890AbCdEfGhIjKlMnOpQrStUvWxYz",
            "SSH_DSA_Private_Key: -----BEGIN DSA PRIVATE KEY-----",
            "SSH_EC_Private_Key: -----BEGIN EC PRIVATE KEY-----",
            "Stripe_API_Key: sk_live_abcdefghijklmnopqrstuvwxyz1234",
            "Stripe_Restricted_API_Key: rk_live_abcdefghijklmnopqrstuvwxyz1234",
            "Twilio_API_Key: SK0123456789abcdef0123456789abcdef",
            "Twitter_Access_Token: twitterAccessToken12345-abcdefghijklmnopqrstuvwxyz1234567890abcdefghijklmnopqrstuvwxyz",
            "Twitter_OAuth: twitter: \"tw1234567890abcdefghij12345\"",
            "Twitter_Secret_Key: TwitterSecretKey1234567890abcdefghijklmnopqrstuvw",
            "AES_KEY: AESKey = \"ThisIsAESKey123456\"",
            "AES_IV: AESIv = \"0123456789abcdef\"",
            "password: password= \"12345!@#\"",
            "WIFI_KEY: WIFI_KEY= \"WIFI_Password!@#\"",
            "DEFAULT_LOCK: password= DEFAULT_LOCK = \"12345\"",
            "Find_HTTP1: http://www.example.com",
            "Find_HTTP2: https://www.example.com",
            "API_KEY: API_KEY = \"MyAPIKey123\"",
            "JWT: eyJ1c2VybmFtZSI6ImpvaG4gZG9lIiwicGFzc3.aW5nZXN0aW9uX19fX2VxdWlwbWVudF9fX3NhbGVzX19fX3JlcXVlc3RlZF9fX2F.aW5nZXN0aW9uX19fX2VxdWlwbWVudF9fX3NhbGVzX19fX3JlcXVlc3RlZF9fX2F",
            "SQLITE_PASSWORD: SQLITE_PASSWORD = \"SQLitePassword!@#\"",
            "alipay_rsaprivatekey: <string name=\"alipay_rsaprivatekey\">ThisIsAlipayPrivateKey</string>",
            "WECHAT_SECRET: WECHAT_SECRET = \"WeChatSecret!@#\"",
            "mail: test.user@sub.example.com",
            "AliyunOSS: https://fake-bucket.oss-cn-hangzhou.aliyuncs.com/fake-folder/fake-file.jpg",
            "HuaweiOBS: https://fake-bucket.obs.ap-southeast-1.myhuaweicloud.com/fake-folder/fake-file.jpg",
            "Amazon S3 OSS: https://s3.amazonaws.com/my-bucket/my-folder/my-file.txt",
            "Amazon S3 OSS false: https://s3.amazonaws.com/my-file.txt",
            "Google Cloud Storage: https://storage.googleapis.com/my-bucket/my-folder/my-file.txt",
            "Microsoft Azure Blob Storage: https://mystorageaccount.blob.core.windows.net/my-container/my-folder/my-file.txt"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFromArray = findViewById(R.id.buttonFromArray);
        Button buttonFromSoFile = findViewById(R.id.buttonFromSoFile);

        buttonFromArray.setOnClickListener(v -> {
            // Display the string array from Java
            Toast.makeText(MainActivity.this, "These from Java ! ", Toast.LENGTH_SHORT).show();
            showStringArray(stringArrayFromJava);
        });

        buttonFromSoFile.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "These from SO! ", Toast.LENGTH_SHORT).show();
            // Load and display the string array from SO file
            showStringArray(new JNIUtils().loadStringArrayFromSoFileJNI());

        });
    }

    public void showStringArray(String[] array) {
        // Create an ArrayAdapter to populate the ListView with the string array
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);

        // Get a reference to the ListView
        ListView listView = findViewById(R.id.listView);

        // Set the adapter to the ListView
        listView.setAdapter(adapter);

        // Optionally, set an item click listener to handle item clicks in the ListView
        listView.setOnItemClickListener((parent, view, position, id) -> {
            // Handle item click here if needed
            String selectedItem = array[position];
            // For example, you can show a Toast with the selected item
            Toast.makeText(MainActivity.this, "Selected Item: " + selectedItem, Toast.LENGTH_SHORT).show();
        });
    }

}

