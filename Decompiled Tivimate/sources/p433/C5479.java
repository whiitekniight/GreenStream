package p433;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;
import p024.AbstractC1388;
import p067.AbstractC1932;
import p067.C1978;
import p423.AbstractC5375;

/* JADX INFO: renamed from: ﹳⁱ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public class C5479 extends AbstractC1388 {

    /* JADX INFO: renamed from: ʽʽ */
    public C1978 f19608;

    /* JADX INFO: renamed from: ˈٴ */
    public final C5477 f19609;

    /* JADX INFO: renamed from: ˉٴ */
    public ByteBuffer f19610;

    /* JADX INFO: renamed from: ˊʻ */
    public boolean f19611;

    /* JADX INFO: renamed from: ٴʼ */
    public final int f19612;

    /* JADX INFO: renamed from: ٴᵢ */
    public long f19613;

    /* JADX INFO: renamed from: ᴵᵔ */
    public ByteBuffer f19614;

    /* JADX INFO: renamed from: ᵎⁱ */
    public final int f19615;

    static {
        AbstractC1932.m4952("media3.decoder");
    }

    public C5479(int r2, int r3) {
        super(3);
        this.f19609 = new C5477();
        this.f19615 = r2;
        this.f19612 = r3;
    }

    /* JADX INFO: renamed from: ʻٴ */
    public final void m10558(int r4) {
        int r42 = r4 + this.f19612;
        ByteBuffer r0 = this.f19614;
        if (r0 != null) goto L6;
        this.f19614 = m10559(r42);
        return;
    L6:
        int r1 = r0.capacity();
        int r2 = r0.position();
        int r43 = r42 + r2;
        if (r1 < r43) goto L10;
        this.f19614 = r0;
        return;
    L10:
        ByteBuffer r44 = m10559(r43);
        r44.order(r0.order());
        if (r2 <= 0) goto L13;
        r0.flip();
        r44.put(r0);
    L13:
        this.f19614 = r44;
    }

    /* JADX INFO: renamed from: ʽﹳ */
    public final ByteBuffer m10559(int r6) {
        int r1 = this.f19615;
        if (r1 != 1) goto L7;
        return ByteBuffer.allocate(r6);
    L7:
        if (r1 == 2) goto L9;
        ByteBuffer r0 = this.f19614;
        if (r0 != null) goto L13;
        int r02 = 0;
    L15:
        throw new DecoderInputBuffer$InsufficientCapacityException(AbstractC5375.m10396("Buffer too small (", r02, " < ", r6, ")"));
    L13:
        r02 = r0.capacity();
        goto L15
    L9:
        return ByteBuffer.allocateDirect(r6);
    }

    /* JADX INFO: renamed from: ˏי */
    public void mo4340() {
        this.f4770 = 0;
        ByteBuffer r1 = this.f19614;
        if (r1 == null) goto L5;
        r1.clear();
    L5:
        ByteBuffer r12 = this.f19610;
        if (r12 == null) goto L8;
        r12.clear();
    L8:
        this.f19611 = false;
    }

    /* JADX INFO: renamed from: ـˆ */
    public final void m10560() {
        ByteBuffer r0 = this.f19614;
        if (r0 == null) goto L5;
        r0.flip();
    L5:
        ByteBuffer r02 = this.f19610;
        if (r02 == null) goto L9;
        r02.flip();
        return;
    }
}
