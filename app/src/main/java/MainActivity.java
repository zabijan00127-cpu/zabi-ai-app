package __PACKAGE__;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView w = new WebView(this);
        setContentView(w);

        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true);

        // Replace later with your hosted URL
        w.loadUrl("https://example.com");
    }
}
