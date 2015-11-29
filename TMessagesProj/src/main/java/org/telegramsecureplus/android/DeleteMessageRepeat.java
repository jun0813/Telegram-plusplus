package org.telegramsecureplus.android;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by jun0813 on 2015. 7. 10..
 */
public class DeleteMessageRepeat extends IntentService {
    public DeleteMessageRepeat() { super("DeleteMessageRepeat");}
    @Override
    protected void onHandleIntent(Intent intent) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public void run() {
                MessagesController.getInstance().deleteMesaages();
            }
        });
    }
}