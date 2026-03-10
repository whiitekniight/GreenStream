package p191;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ˋˋ.ˆﾞ */
/* JADX INFO: loaded from: classes.dex */
public class C3171 {

    /* JADX INFO: renamed from: ʼˎ */
    public final LinearInterpolator f11176;

    /* JADX INFO: renamed from: ʼᐧ */
    public int f11177;

    /* JADX INFO: renamed from: ʽ */
    public AbstractC3152 f11178;

    /* JADX INFO: renamed from: ˆʾ */
    public final DecelerateInterpolator f11179;

    /* JADX INFO: renamed from: ˈ */
    public boolean f11180;

    /* JADX INFO: renamed from: ˉʿ */
    public boolean f11181;

    /* JADX INFO: renamed from: ˉˆ */
    public int f11182;

    /* JADX INFO: renamed from: ˑﹳ */
    public boolean f11183;

    /* JADX INFO: renamed from: ٴﹶ */
    public PointF f11184;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final C3198 f11185;

    /* JADX INFO: renamed from: ᵔʾ */
    public float f11186;

    /* JADX INFO: renamed from: ᵔᵢ */
    public boolean f11187;

    /* JADX INFO: renamed from: ⁱˊ */
    public RecyclerView f11188;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f11189;

    /* JADX INFO: renamed from: ﾞʻ */
    public final DisplayMetrics f11190;

    /* JADX INFO: renamed from: ﾞᴵ */
    public View f11191;

    public C3171(Context r4) {
        this.f11189 = -1;
        C3198 r1 = new C3198();
        r1.f11266 = -1;
        r1.f11271 = false;
        r1.f11268 = 0;
        r1.f11270 = 0;
        r1.f11269 = 0;
        r1.f11265 = Integer.MIN_VALUE;
        r1.f11267 = null;
        this.f11185 = r1;
        this.f11176 = new LinearInterpolator();
        this.f11179 = new DecelerateInterpolator();
        this.f11181 = false;
        this.f11182 = 0;
        this.f11177 = 0;
        this.f11190 = r4.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static int m6746(int r1, int r2, int r3, int r4, int r5) {
        if (r5 == (-1)) goto L20;
        if (r5 != 0) goto L6;
        int r32 = r3 - r1;
        if (r32 <= 0) goto L14;
        return r32;
    L14:
        int r42 = r4 - r2;
        if (r42 >= 0) goto L17;
        return r42;
    L17:
        return 0;
    L6:
        if (r5 != 1) goto L10;
        return r4 - r2;
    L10:
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    L20:
        return r3 - r1;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public void mo658(View r7, C3198 r8) {
        PointF r0 = this.f11184;
        int r1 = 0;
        if (r0 == null) goto L10;
        float r02 = r0.x;
        if (r02 == 0.0f) goto L10;
        if (r02 <= 0.0f) goto L9;
        int r03 = 1;
    L11:
        int r04 = mo6750(r7, r03);
        PointF r5 = this.f11184;
        if (r5 == null) goto L19;
        float r52 = r5.y;
        if (r52 == 0.0f) goto L19;
        if (r52 <= 0.0f) goto L18;
        r1 = 1;
        goto L19
    L18:
        r1 = -1;
    L19:
        int r72 = mo6747(r7, r1);
        int r2 = r72 * r72;
        int r12 = (int) Math.ceil(((double) mo660((int) Math.sqrt(r2 + (r04 * r04)))) / 0.3356d);
        if (r12 <= 0) goto L23;
        r8.f11270 = -r04;
        r8.f11269 = -r72;
        r8.f11265 = r12;
        r8.f11267 = this.f11179;
        r8.f11271 = true;
        return;
    L23:
        return;
    L9:
        r03 = -1;
    L10:
        r03 = 0;
        goto L11
    }

    /* JADX INFO: renamed from: ʽ */
    public int mo6747(View r5, int r6) {
        AbstractC3152 r0 = this.f11178;
        if (r0 != null) goto L5;
        return 0;
    L5:
        if (r0.mo538() == false) goto L11;
        C3183 r1 = (C3183) r5.getLayoutParams();
        return m6746(r0.mo516(r5) - ((ViewGroup.MarginLayoutParams) r1).topMargin, r0.mo477(r5) + ((ViewGroup.MarginLayoutParams) r1).bottomMargin, r0.m6700(), r0.f11090 - r0.m6699(), r6);
    L11:
        return 0;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final void m6748() {
        if (this.f11183 == true) goto L5;
        return;
    L5:
        this.f11183 = false;
        mo661();
        this.f11188.f1516.f11322 = -1;
        this.f11191 = null;
        this.f11189 = -1;
        this.f11180 = false;
        AbstractC3152 r0 = this.f11178;
        if (r0.f11091 != this) goto L8;
        r0.f11091 = null;
    L8:
        this.f11178 = null;
        this.f11188 = null;
    }

    /* JADX INFO: renamed from: ˈ */
    public float mo659(DisplayMetrics r2) {
        return 25.0f / r2.densityDpi;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public int mo660(int r3) {
        float r32 = Math.abs(r3);
        if (this.f11181 == true) goto L6;
        this.f11186 = mo659(this.f11190);
        this.f11181 = true;
    L6:
        return (int) Math.ceil(r32 * this.f11186);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m6749(int r9, int r10) {
        RecyclerView r0 = this.f11188;
        int r2 = -1;
        if (this.f11189 == (-1)) goto L5;
        if (r0 == null) goto L5;
    L7:
        if (this.f11180 == true) goto L9;
    L19:
        boolean r1 = false;
        this.f11180 = false;
        View r5 = this.f11191;
        C3198 r6 = this.f11185;
        if (r5 == null) goto L29;
        this.f11188.getClass();
        AbstractC3156 r52 = RecyclerView.m927(r5);
        if (r52 == null) goto L25;
        r2 = r52.m6719();
    L25:
        if (r2 != this.f11189) goto L27;
        View r22 = this.f11191;
        C3206 r3 = r0.f1516;
        mo658(r22, r6);
        r6.m6808(r0);
        m6748();
        goto L29
    L27:
        this.f11191 = null;
    L29:
        if (this.f11183 == false) goto L60;
        C3206 r23 = r0.f1516;
        if (this.f11188.f1521.m6685() != 0) goto L33;
        m6748();
    L52:
        if (r6.f11266 < 0) goto L54;
        r1 = true;
    L54:
        r6.m6808(r0);
        if (r1 == true) goto L57;
        return;
    L57:
        if (this.f11183 == false) goto L62;
        this.f11180 = true;
        r0.f1507.m6787();
        return;
    L62:
        return;
    L33:
        int r24 = this.f11182;
        int r92 = r24 - r9;
        if ((r24 * r92) > 0) goto L36;
        r92 = 0;
    L36:
        this.f11182 = r92;
        int r25 = this.f11177;
        int r102 = r25 - r10;
        if ((r25 * r102) > 0) goto L39;
        r102 = 0;
    L39:
        this.f11177 = r102;
        if (r92 != 0) goto L52;
        if (r102 != 0) goto L52;
        PointF r93 = mo573(this.f11189);
        if (r93 != null) goto L45;
    L50:
        r6.f11266 = this.f11189;
        m6748();
        goto L52
    L45:
        if (r93.x == 0.0f) goto L47;
    L49:
        float r26 = r93.y;
        float r27 = r26 * r26;
        float r103 = (float) Math.sqrt(r27 + (r10 * r10));
        float r28 = r93.x / r103;
        r93.x = r28;
        float r4 = r93.y / r103;
        r93.y = r4;
        this.f11184 = r93;
        this.f11182 = (int) (r28 * 10000.0f);
        this.f11177 = (int) (r4 * 10000.0f);
        int r94 = mo660(10000);
        r6.f11270 = (int) (this.f11182 * 1.2f);
        r6.f11269 = (int) (this.f11177 * 1.2f);
        r6.f11265 = (int) (r94 * 1.2f);
        r6.f11267 = this.f11176;
        r6.f11271 = true;
        goto L52
    L47:
        if (r93.y != 0.0f) goto L49;
    L60:
        return;
    L9:
        if (this.f11191 != null) goto L19;
        if (this.f11178 == null) goto L19;
        PointF r12 = mo573(this.f11189);
        if (r12 == null) goto L19;
        float r53 = r12.x;
        if (r53 == 0.0f) goto L17;
    L18:
        r0.m948(null, (int) Math.signum(r53), (int) Math.signum(r12.y));
        goto L19
    L17:
        if (r12.y == 0.0f) goto L19;
    L5:
        m6748();
        goto L7
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public void mo661() {
        this.f11177 = 0;
        this.f11182 = 0;
        this.f11184 = null;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public int mo6750(View r5, int r6) {
        AbstractC3152 r0 = this.f11178;
        if (r0 != null) goto L5;
        return 0;
    L5:
        if (r0.mo506() == false) goto L11;
        C3183 r1 = (C3183) r5.getLayoutParams();
        return m6746(r0.mo472(r5) - ((ViewGroup.MarginLayoutParams) r1).leftMargin, r0.mo491(r5) + ((ViewGroup.MarginLayoutParams) r1).rightMargin, r0.m6695(), r0.f11094 - r0.m6698(), r6);
    L11:
        return 0;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public PointF mo573(int r3) {
        Object r0 = this.f11178;
        if ((r0 instanceof InterfaceC3160) == true) goto L5;
        String r02 = "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC3160.class.getCanonicalName();
        return null;
    L5:
        return ((InterfaceC3160) r0).mo916(r3);
    }
}
