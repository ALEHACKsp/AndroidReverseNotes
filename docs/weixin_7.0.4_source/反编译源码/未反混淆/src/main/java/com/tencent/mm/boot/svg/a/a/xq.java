package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class xq extends c {
    private final int height = 32;
    private final int width = 20;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 20;
            case 1:
                return 32;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.h(looper);
                c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                k = c.a(k, looper);
                k.setColor(-2565928);
                Path l = c.l(looper);
                l.moveTo(15.773302f, 11.530662f);
                l.lineTo(4.2426405f, -1.7763568E-15f);
                l.lineTo(0.0f, 4.2426405f);
                l.lineTo(11.530662f, 15.773302f);
                l.lineTo(0.027727231f, 27.276237f);
                l.lineTo(4.270368f, 31.518877f);
                l.lineTo(20.021301f, 15.767945f);
                l.lineTo(15.77866f, 11.525304f);
                l.lineTo(15.773302f, 11.530662f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
