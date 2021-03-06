package com.tencent.mm.splash;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import java.lang.reflect.Field;

final class j implements Callback {
    public static int xHf = 100;
    public static int xHg = 113;
    public static int xHh = 114;
    public static int xHi = 115;
    public static int xHj = 116;
    public static int xHk = 121;
    public static int xHl = 122;
    public static int xHm = 126;
    public static int xHn = 145;
    private static boolean xHo = false;
    private static Runnable xHp;
    private static boolean xHr = false;
    private Context mContext;
    Callback oUK;
    private boolean xHq = false;

    public j(Context context, Callback callback) {
        this.mContext = context;
        this.oUK = callback;
    }

    public static void av(Runnable runnable) {
        xHo = true;
        xHp = runnable;
    }

    public static boolean dro() {
        return xHr;
    }

    public final boolean handleMessage(Message message) {
        AppMethodBeat.i(114884);
        if (this.xHq) {
            h.g("WxSplash.SplashHackHandlerCallback", "found a infinite call loop", new Object[0]);
            AppMethodBeat.o(114884);
            return true;
        }
        xHr = false;
        h.g("WxSplash.SplashHackHandlerCallback", "before handleMessage %s, splash %s, pending early %s", Integer.valueOf(message.what), Boolean.valueOf(h.dra()), Boolean.valueOf(h.drb()));
        if (xHo && message.what == 987654321) {
            if (xHp != null) {
                h.g("WxSplash.SplashHackHandlerCallback", "verify hack received.", new Object[0]);
                xHp.run();
            }
            AppMethodBeat.o(114884);
            return true;
        }
        if (h.dra() && !h.drb()) {
            h.g("WxSplash.SplashHackHandlerCallback", "handleMessage %s, splash %s", Integer.valueOf(message.what), Boolean.valueOf(h.dra()));
            if (message.what == xHg || message.what == xHh || message.what == xHi || message.what == xHj || message.what == xHk || message.what == xHl || message.what == xHn) {
                Message obtain = Message.obtain();
                obtain.copyFrom(message);
                h.xGD.add(obtain);
                if (h.xGI != null) {
                    h.xGI.BO();
                }
                AppMethodBeat.o(114884);
                return true;
            }
        }
        if (message.what == xHm || (VERSION.SDK_INT == 28 && message.what == 160)) {
            if (h.xGJ.size() > 0) {
                xHr = true;
            }
            h.g("WxSplash.SplashHackHandlerCallback", "received a RELAUNCH_ACTIVITY message, with %s splash activity", Integer.valueOf(h.xGJ.size()));
            Object obj = message.obj;
            if (d.iX(25)) {
                try {
                    if (l.xHA == null) {
                        Field declaredField = Class.forName("android.app.ActivityThread$ActivityClientRecord").getDeclaredField("mPreserveWindow");
                        declaredField.setAccessible(true);
                        l.xHA = declaredField;
                    }
                    h.g("WxSplash.SplashHackHandlerCallback", "preserveWindow is %s, will set false", Boolean.valueOf(((Boolean) l.xHA.get(obj)).booleanValue()));
                    l.xHA.set(obj, Boolean.FALSE);
                } catch (Exception e) {
                    h.a(e, "");
                }
            }
        }
        if (this.oUK != null) {
            this.xHq = true;
            boolean handleMessage = this.oUK.handleMessage(message);
            this.xHq = false;
            AppMethodBeat.o(114884);
            return handleMessage;
        }
        AppMethodBeat.o(114884);
        return false;
    }
}
