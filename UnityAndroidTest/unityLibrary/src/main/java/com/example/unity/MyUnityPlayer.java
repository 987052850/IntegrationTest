package com.example.unity;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.UnityPlayer;
import com.unity3d.player.IUnityPlayerLifecycleEvents;

public class MyUnityPlayer extends UnityPlayer {

    public MyUnityPlayer(Context context) {
        super((Activity) context);
    }

    public MyUnityPlayer(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        super((Activity) context, iUnityPlayerLifecycleEvents);
    }

    // 自定义 kill 方法
    public void kill() {
        // 自定义清理或关闭 UnityPlayer 的代码
    }


}
