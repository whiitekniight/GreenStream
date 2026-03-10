package p171;

import android.database.Cursor;
import android.support.v4.media.session.ⁱˊ;
import androidx.leanback.widget.ˉˆ;
import java.util.Arrays;
import p046.InterfaceC1679;

/* JADX INFO: renamed from: ˊˎ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3027 extends AbstractC3028 {

    /* JADX INFO: renamed from: ˈٴ */
    public int[] f10586;

    /* JADX INFO: renamed from: ˉٴ */
    public byte[][] f10587;

    /* JADX INFO: renamed from: ˊʻ */
    public double[] f10588;

    /* JADX INFO: renamed from: ٴᵢ */
    public String[] f10589;

    /* JADX INFO: renamed from: ᴵᵔ */
    public long[] f10590;

    /* JADX INFO: renamed from: ᵎⁱ */
    public Cursor f10591;

    /* JADX INFO: renamed from: ﹳᐧ */
    public static void m6406(Cursor r0, int r1) {
        if (r1 >= 0) goto L4;
    L6:
        ⁱˊ.ʻٴ(25, "column index out of range");
        throw null;
    L4:
        if (r1 >= r0.getColumnCount()) goto L6;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f10592 == true) goto L5;
        m6410();
        this.f10586 = new int[0];
        this.f10590 = new long[0];
        this.f10588 = new double[0];
        this.f10589 = new String[0];
        this.f10587 = new byte[0][];
        reset();
    L5:
        this.f10592 = true;
    }

    @Override // p429.InterfaceC5413
    public final byte[] getBlob(int r2) {
        m6410();
        Cursor r0 = m6408();
        m6406(r0, r2);
        return r0.getBlob(r2);
    }

    @Override // p429.InterfaceC5413
    public final int getColumnCount() {
        m6410();
        m6407();
        Cursor r0 = this.f10591;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getColumnCount();
    }

    @Override // p429.InterfaceC5413
    public final String getColumnName(int r2) {
        m6410();
        m6407();
        Cursor r0 = this.f10591;
        if (r0 == null) goto L7;
        m6406(r0, r2);
        return r0.getColumnName(r2);
    L7:
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p429.InterfaceC5413
    public final double getDouble(int r3) {
        m6410();
        Cursor r0 = m6408();
        m6406(r0, r3);
        return r0.getDouble(r3);
    }

    @Override // p429.InterfaceC5413
    public final long getLong(int r3) {
        m6410();
        Cursor r0 = m6408();
        m6406(r0, r3);
        return r0.getLong(r3);
    }

    @Override // p429.InterfaceC5413
    public final boolean isNull(int r2) {
        m6410();
        Cursor r0 = m6408();
        m6406(r0, r2);
        return r0.isNull(r2);
    }

    @Override // p429.InterfaceC5413
    public final void reset() {
        m6410();
        Cursor r0 = this.f10591;
        if (r0 == null) goto L5;
        r0.close();
    L5:
        this.f10591 = null;
    }

    /* JADX INFO: renamed from: ˉˆ */
    public final void m6407() {
        if (this.f10591 != null) goto L6;
        InterfaceC1679 r0 = new ˉˆ(29, this);
        this.f10591 = this.f10593.mo4420(r0);
        return;
    }

    @Override // p429.InterfaceC5413
    /* JADX INFO: renamed from: ˑٴ */
    public final void mo4102(int r3, String r4) {
        m6410();
        m6409(3, r3);
        this.f10586[r3] = 3;
        this.f10589[r3] = r4;
    }

    /* JADX INFO: renamed from: ـˆ */
    public final Cursor m6408() {
        Cursor r0 = this.f10591;
        if (r0 == null) goto L5;
        return r0;
    L5:
        ⁱˊ.ʻٴ(21, "no row");
        throw null;
    }

    @Override // p429.InterfaceC5413
    /* JADX INFO: renamed from: ᵎᵔ */
    public final boolean mo4103() {
        m6410();
        m6407();
        Cursor r0 = this.f10591;
        if (r0 == null) goto L7;
        return r0.moveToNext();
    L7:
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m6409(int r4, int r5) {
        int r52 = r5 + 1;
        int[] r1 = this.f10586;
        if (r1.length >= r52) goto L5;
        this.f10586 = Arrays.copyOf(r1, r52);
    L5:
        if (r4 != 1) goto L7;
        long[] r42 = this.f10590;
        if (r42.length >= r52) goto L32;
        this.f10590 = Arrays.copyOf(r42, r52);
        return;
    L32:
        return;
    L7:
        if (r4 != 2) goto L9;
        double[] r43 = this.f10588;
        if (r43.length >= r52) goto L31;
        this.f10588 = Arrays.copyOf(r43, r52);
        return;
    L31:
        return;
    L9:
        if (r4 != 3) goto L11;
        String[] r44 = this.f10589;
        if (r44.length >= r52) goto L30;
        this.f10589 = (String[]) Arrays.copyOf(r44, r52);
        return;
    L30:
        return;
    L11:
        if (r4 != 4) goto L33;
        byte[][] r45 = this.f10587;
        if (r45.length >= r52) goto L29;
        this.f10587 = (byte[][]) Arrays.copyOf(r45, r52);
        return;
    L29:
        return;
    }

    @Override // p429.InterfaceC5413
    /* JADX INFO: renamed from: ᵔᵢ */
    public final void mo4104(int r3, byte[] r4) {
        m6410();
        m6409(4, r3);
        this.f10586[r3] = 4;
        this.f10587[r3] = r4;
    }

    @Override // p429.InterfaceC5413
    /* JADX INFO: renamed from: ᵔﹳ */
    public final String mo4105(int r2) {
        m6410();
        Cursor r0 = m6408();
        m6406(r0, r2);
        return r0.getString(r2);
    }

    @Override // p429.InterfaceC5413
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo4106(int r3, double r4) {
        m6410();
        m6409(2, r3);
        this.f10586[r3] = 2;
        this.f10588[r3] = r4;
    }

    @Override // p429.InterfaceC5413
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo4107(int r3) {
        m6410();
        m6409(5, r3);
        this.f10586[r3] = 5;
    }

    @Override // p429.InterfaceC5413
    /* JADX INFO: renamed from: ﾞᴵ */
    public final void mo4108(int r3, long r4) {
        m6410();
        m6409(1, r3);
        this.f10586[r3] = 1;
        this.f10590[r3] = r4;
    }
}
