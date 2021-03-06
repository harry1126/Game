package com.fju.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    float posX, posY = 400;
    private Bitmap bitmap;


    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("game","onDraw"+":"+getWidth()+","+getHeight());
        Paint paint = new Paint();
        canvas.drawLine(400,0,0,600, paint);
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.dog);
        canvas.drawBitmap(bitmap,posX,posY,paint);
//        for(int i=0;i<getHeight()-bitmap.getHeight();i+=50){
//            canvas.drawBitmap(bitmap,400,300+i,paint);
//        }
    }
//    public void moveLeft(){
//        if(posX>50){
//            posX = posX-50;
//            invalidate();
//        }
//    }
//    public void moveRight(){
//        if(posX<getWidth()-bitmap.getWidth()){
//            posX+=50;
//            invalidate();
//        }
//    }
//    public void moveUp(){
//        if(posY>50){
//            posY-=50;
//            invalidate();
//        }
//    }
//    public void moveDown(){
//        if(posY<getHeight()-bitmap.getHeight()){
//            posY+=50;
//            invalidate();
//        }
//    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        if(posX>0 && posX<getWidth()-bitmap.getWidth()) {
            this.posX = posX;
        }
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        if(posY>0 && posY<getHeight()-bitmap.getHeight()) {
            this.posY = posY;
        }
    }
}
