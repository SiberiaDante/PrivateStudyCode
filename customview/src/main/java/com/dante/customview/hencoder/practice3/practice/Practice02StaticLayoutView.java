package com.dante.customview.hencoder.practice3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class Practice02StaticLayoutView extends View {
    TextPaint textPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello\nHenCoder";
    private StaticLayout staticLayout;

    {
        textPaint.setTextSize(60);
        staticLayout = new StaticLayout(text, textPaint, 300, Layout.Alignment.ALIGN_NORMAL, 1, 0, false);

    }

    public Practice02StaticLayoutView(Context context) {
        super(context);
    }

    public Practice02StaticLayoutView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02StaticLayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 StaticLayout 代替 Canvas.drawText() 来绘制文字，
        canvas.save();
        canvas.translate(100, 100);
        staticLayout.draw(canvas);
        canvas.restore();
        // 以绘制出带有换行的文字
//        canvas.drawText(text, 50, 100, textPaint);
    }
}
