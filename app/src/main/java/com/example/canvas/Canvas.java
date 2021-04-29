package com.example.canvas;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Canvas extends View {

    Paint paint;
    Rect rect;

    public Canvas(Context context) {
        super(context);
        paint = new Paint();
        rect = new Rect();
    }

    @Override
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);

        canvas.drawRect(200, 200, 500, 500, paint);
        canvas.drawCircle(800, 350, 150, paint);
        canvas.drawLine(200, 600, 600, 600, paint);
        canvas.drawLine(200, 650, 600, 650, paint);
        canvas.drawLine(900, 900, 600, 700, paint);
    }
}