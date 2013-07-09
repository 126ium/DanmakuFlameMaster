/*
 * Copyright (C) 2013 Chen Hui <calmer91@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tv.light.controller;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;

public class DrawHelper {

    public static Paint paint;
    static {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(50);
        paint.setAntiAlias(true);
    }

    public static void drawText(Canvas canvas, String text) {

        canvas.drawText(text, 50, 50, paint);

    }

    public static void drawDuration(Canvas canvas, String text) {
        canvas.drawText(text, 100, 100, paint);
    }

    public static void drawCircle(float cx, float cy, Canvas canvas) {
        canvas.drawCircle(cx, cy, 50, paint);
    }

    public static void clearCanvas(Canvas canvas) {
        canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);
    }
}