package p062;

import com.hierynomus.protocol.transport.TransportException;
import com.parse.ٴʼ;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import p438.C5537;
import p461.InterfaceC5843;

/* JADX INFO: renamed from: ʽٴ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C1868 implements InterfaceC5843 {

    /* JADX INFO: renamed from: ʽʽ */
    public Boolean f6378;

    /* JADX INFO: renamed from: ʾˋ */
    public final String f6379;

    /* JADX INFO: renamed from: ˈٴ */
    public Method f6380;

    /* JADX INFO: renamed from: ˊʻ */
    public final Queue f6381;

    /* JADX INFO: renamed from: ٴᵢ */
    public final boolean f6382;

    /* JADX INFO: renamed from: ᴵˊ */
    public volatile InterfaceC5843 f6383;

    /* JADX INFO: renamed from: ᴵᵔ */
    public ٴʼ f6384;

    public C1868(String r1, LinkedBlockingQueue r2, boolean r3) {
        this.f6379 = r1;
        this.f6381 = r2;
        this.f6382 = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L14:
        return false;
    L8:
        if (C1868.class != r5.getClass()) goto L14;
        if (this.f6379.equals(((C1868) r5).f6379) == true) goto L13;
        return false;
    L13:
        return true;
    }

    @Override // p461.InterfaceC5843
    public final String getName() {
        return this.f6379;
    }

    public final int hashCode() {
        return this.f6379.hashCode();
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ʻٴ */
    public final void mo4793(String r2, Object r3, Number r4) {
        m4810().mo4793(r2, r3, r4);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ʼʼ */
    public final void mo4794(Object... r2) {
        m4810().mo4794(r2);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ʼˎ */
    public final void mo4795(Object r2, String r3) {
        m4810().mo4795(r2, r3);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ʼᐧ */
    public final void mo4796(Long r2, IOException r3) {
        m4810().mo4796(r2, r3);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ʽ */
    public final void mo4797(String r2, Object... r3) {
        m4810().mo4797(r2, r3);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ʾᵎ */
    public final void mo4798(Object... r2) {
        m4810().mo4798(r2);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ˆʾ */
    public final void mo4799(String r2, Throwable r3) {
        m4810().mo4799(r2, r3);
    }

    /* JADX INFO: renamed from: ˈ */
    public final boolean m4800() {
        Boolean r0 = this.f6378;
        if (r0 != null) goto L5;
        this.f6380 = this.f6383.getClass().getMethod("log", new Class[]{C5537.class});     // Catch: NoSuchMethodException -> L8
        this.f6378 = Boolean.TRUE;     // Catch: NoSuchMethodException -> L8
    L10:
        return this.f6378.booleanValue();
    L8:
        this.f6378 = Boolean.FALSE;
        goto L10
    L5:
        return r0.booleanValue();
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ˏי */
    public final void mo4801(Object r2, Object r3, String r4) {
        m4810().mo4801(r2, r3, r4);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ˑﹳ */
    public final void mo4802() {
        m4810().mo4802();
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: יـ */
    public final void mo4803(Exception r2) {
        m4810().mo4803(r2);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ـˆ */
    public final void mo4804(TransportException r2) {
        m4810().mo4804(r2);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ٴﹶ */
    public final void mo4805(Object r2, String r3) {
        m4810().mo4805(r2, r3);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ᵎﹶ */
    public final void mo4806(String r2) {
        m4810().mo4806(r2);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ᵔʾ */
    public final void mo4807(Object r2, String r3) {
        m4810().mo4807(r2, r3);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ᵔᵢ */
    public final void mo4808(Object r2, Object r3, String r4) {
        m4810().mo4808(r2, r3, r4);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ᵔﹳ */
    public final void mo4809(Object r2, String r3) {
        m4810().mo4809(r2, r3);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC5843 m4810() {
        if (this.f6383 == null) goto L7;
        return this.f6383;
    L7:
        if (this.f6382 == false) goto L11;
        return C1869.f6385;
    L11:
        if (this.f6384 != null) goto L14;
        Queue r1 = this.f6381;
        ٴʼ r0 = new ٴʼ(23, false);
        r0.ʽʽ = this;
        r0.ᴵˊ = this.f6379;
        r0.ˈٴ = r1;
        this.f6384 = r0;
    L14:
        return this.f6384;
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo4811(Object r2, String r3) {
        m4810().mo4811(r2, r3);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ﹳᐧ */
    public final void mo4812(String r2) {
        m4810().mo4812(r2);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ﾞʻ */
    public final void mo4813(Object r2, Object r3, String r4) {
        m4810().mo4813(r2, r3, r4);
    }

    @Override // p461.InterfaceC5843
    /* JADX INFO: renamed from: ﾞᴵ */
    public final void mo4814(Object... r2) {
        m4810().mo4814(r2);
    }
}
