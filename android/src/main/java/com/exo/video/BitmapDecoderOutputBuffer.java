package com.exo.video;

import android.graphics.Bitmap;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.VideoDecoderOutputBuffer;

@UnstableApi
public class BitmapDecoderOutputBuffer extends VideoDecoderOutputBuffer {
    @Nullable
    private Bitmap bitmap;

    public BitmapDecoderOutputBuffer(Owner<VideoDecoderOutputBuffer> owner) {
        super(owner);
    }

    @Nullable
    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public void release() {
        super.release();
        setBitmap(null);
    }
}
