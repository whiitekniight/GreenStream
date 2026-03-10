package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    public HttpException(int r2, IOException r3, String r4) {
        super(r4 + ", status code: " + r2, r3);
    }
}
