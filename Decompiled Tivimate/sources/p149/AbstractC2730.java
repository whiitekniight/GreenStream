package p149;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.parse.ٴʼ;
import p198.AbstractC3306;
import p362.AbstractC4778;

/* JADX INFO: renamed from: ˉˆ.ʽⁱ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2730 extends ViewGroup {

    /* JADX INFO: renamed from: ʽʽ */
    public int f9735;

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f9736;

    /* JADX INFO: renamed from: ˆﾞ */
    public int f9737;

    /* JADX INFO: renamed from: ˈʿ */
    public int f9738;

    /* JADX INFO: renamed from: ˈٴ */
    public int f9739;

    /* JADX INFO: renamed from: ˉٴ */
    public boolean f9740;

    /* JADX INFO: renamed from: ˊʻ */
    public int f9741;

    /* JADX INFO: renamed from: ٴʼ */
    public int[] f9742;

    /* JADX INFO: renamed from: ٴᵢ */
    public float f9743;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f9744;

    /* JADX INFO: renamed from: ᴵᵔ */
    public int f9745;

    /* JADX INFO: renamed from: ᵎˊ */
    public Drawable f9746;

    /* JADX INFO: renamed from: ᵎⁱ */
    public int[] f9747;

    /* JADX INFO: renamed from: ᵔי */
    public int f9748;

    /* JADX INFO: renamed from: ᵔٴ */
    public int f9749;

    public AbstractC2730(Context r10, AttributeSet r11, int r12) {
        super(r10, r11, 0);
        this.f9736 = true;
        this.f9744 = -1;
        this.f9735 = 0;
        this.f9745 = 8388659;
        int[] r2 = AbstractC4778.f16858;
        ٴʼ r8 = ٴʼ.ʿᵢ(0, 0, r10, r11, r2);
        AbstractC3306.m6993(this, r10, r2, r11, (TypedArray) r8.ᴵˊ, 0);
        TypedArray r102 = (TypedArray) r8.ᴵˊ;
        int r112 = r102.getInt(1, -1);
        if (r112 < 0) goto L5;
        setOrientation(r112);
    L5:
        int r113 = r102.getInt(0, -1);
        if (r113 < 0) goto L8;
        setGravity(r113);
    L8:
        boolean r114 = r102.getBoolean(2, true);
        if (r114 == true) goto L11;
        setBaselineAligned(r114);
    L11:
        this.f9743 = r102.getFloat(4, -1.0f);
        this.f9744 = r102.getInt(3, -1);
        this.f9740 = r102.getBoolean(7, false);
        setDividerDrawable(r8.ˑٴ(5));
        this.f9749 = r102.getInt(8, 0);
        this.f9738 = r102.getDimensionPixelSize(6, 0);
        r8.ᐧᴵ();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof C2778;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return mo57();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet r1) {
        return mo54(r1);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return mo55(r1);
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.f9744 < 0) goto L5;
        int r0 = getChildCount();
        int r1 = this.f9744;
        if (r0 <= r1) goto L29;
        View r02 = getChildAt(r1);
        int r12 = r02.getBaseline();
        if (r12 == (-1)) goto L11;
        int r2 = this.f9735;
        if (this.f9739 != 1) goto L27;
        int r3 = this.f9745 & 112;
        if (r3 == 48) goto L27;
        if (r3 != 16) goto L22;
        r2 = r2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f9741) / 2);
        goto L27
    L22:
        if (r3 != 80) goto L27;
        r2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f9741;
    L27:
        return (r2 + ((LinearLayout.LayoutParams) ((C2778) r02.getLayoutParams())).topMargin) + r12;
    L11:
        if (this.f9744 != 0) goto L14;
        return -1;
    L14:
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    L29:
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    L5:
        return super.getBaseline();
    }

    public int getBaselineAlignedChildIndex() {
        return this.f9744;
    }

    public Drawable getDividerDrawable() {
        return this.f9746;
    }

    public int getDividerPadding() {
        return this.f9738;
    }

    public int getDividerWidth() {
        return this.f9748;
    }

    public int getGravity() {
        return this.f9745;
    }

    public int getOrientation() {
        return this.f9739;
    }

    public int getShowDividers() {
        return this.f9749;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f9743;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r8) {
        if (this.f9746 == null) goto L69;
        int r2 = 0;
        if (this.f9739 != 1) goto L25;
        int r0 = getVirtualChildCount();
    L8:
        if (r2 >= r0) goto L18;
        View r4 = getChildAt(r2);
        if (r4 == null) goto L16;
        if (r4.getVisibility() == 8) goto L16;
        if (m5969(r2) == false) goto L16;
        m5970(r8, (r4.getTop() - ((LinearLayout.LayoutParams) ((C2778) r4.getLayoutParams())).topMargin) - this.f9737);
    L16:
        r2 = r2 + 1;
        goto L8
    L18:
        if (m5969(r0) == false) goto L67;
        View r02 = getChildAt(r0 - 1);
        if (r02 != null) goto L22;
        int r03 = (getHeight() - getPaddingBottom()) - this.f9737;
    L23:
        m5970(r8, r03);
        return;
    L22:
        r03 = r02.getBottom() + ((LinearLayout.LayoutParams) ((C2778) r02.getLayoutParams())).bottomMargin;
        goto L23
    L67:
        return;
    L25:
        int r04 = getVirtualChildCount();
        boolean r42 = AbstractC2740.f9803;
        if (getLayoutDirection() != 1) goto L28;
        boolean r43 = true;
    L29:
        if (r2 >= r04) goto L43;
        View r5 = getChildAt(r2);
        if (r5 == null) goto L41;
        if (r5.getVisibility() == 8) goto L41;
        if (m5969(r2) == false) goto L41;
        C2778 r6 = (C2778) r5.getLayoutParams();
        if (r43 == false) goto L39;
        int r52 = r5.getRight() + ((LinearLayout.LayoutParams) r6).rightMargin;
    L40:
        m5971(r8, r52);
        goto L41
    L39:
        r52 = (r5.getLeft() - ((LinearLayout.LayoutParams) r6).leftMargin) - this.f9748;
    L41:
        r2 = r2 + 1;
        goto L29
    L43:
        if (m5969(r04) == false) goto L68;
        View r05 = getChildAt(r04 - 1);
        if (r05 != null) goto L50;
        if (r43 == false) goto L48;
        int r06 = getPaddingLeft();
    L54:
        m5971(r8, r06);
        return;
    L48:
        int r07 = getWidth() - getPaddingRight();
        int r1 = this.f9748;
    L49:
        r06 = r07 - r1;
        goto L54
    L50:
        C2778 r12 = (C2778) r05.getLayoutParams();
        if (r43 == false) goto L53;
        r07 = r05.getLeft() - ((LinearLayout.LayoutParams) r12).leftMargin;
        r1 = this.f9748;
        goto L49
    L53:
        r06 = r05.getRight() + ((LinearLayout.LayoutParams) r12).rightMargin;
        goto L54
    L68:
        return;
    L28:
        r43 = false;
        goto L29
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        r2.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        int r3 = 8;
        char r8 = 2;
        if (this.f9739 != 1) goto L32;
        int r1 = getPaddingLeft();
        int r10 = r26 - r24;
        int r11 = r10 - getPaddingRight();
        int r102 = (r10 - r1) - getPaddingRight();
        int r12 = getVirtualChildCount();
        int r13 = this.f9745;
        int r14 = r13 & 112;
        int r7 = 8388615 & r13;
        if (r14 == 16) goto L9;
        if (r14 == 80) goto L8;
        int r5 = getPaddingTop();
    L10:
        int r4 = 0;
    L11:
        if (r4 >= r12) goto L85;
        View r6 = getChildAt(r4);
        if (r6 != null) goto L16;
    L14:
        char r232 = r8;
    L31:
        r4 = r4 + 1;
        r8 = r232;
        r3 = 8;
        goto L11
    L16:
        if (r6.getVisibility() == r3) goto L14;
        int r132 = r6.getMeasuredWidth();
        int r142 = r6.getMeasuredHeight();
        C2778 r15 = (C2778) r6.getLayoutParams();
        r232 = r8;
        int r82 = ((LinearLayout.LayoutParams) r15).gravity;
        if (r82 >= 0) goto L20;
        r82 = r7;
    L20:
        int r32 = Gravity.getAbsoluteGravity(r82, getLayoutDirection()) & 7;
        if (r32 == 1) goto L26;
        if (r32 == 5) goto L24;
        int r33 = ((LinearLayout.LayoutParams) r15).leftMargin + r1;
    L28:
        if (m5969(r4) == false) goto L30;
        r5 = r5 + this.f9737;
    L30:
        int r52 = r5 + ((LinearLayout.LayoutParams) r15).topMargin;
        r6.layout(r33, r52, r132 + r33, r52 + r142);
        r5 = (r142 + ((LinearLayout.LayoutParams) r15).bottomMargin) + r52;
        goto L31
    L24:
        int r34 = r11 - r132;
        int r83 = ((LinearLayout.LayoutParams) r15).rightMargin;
    L25:
        r33 = r34 - r83;
        goto L28
    L26:
        r34 = (((r102 - r132) / 2) + r1) + ((LinearLayout.LayoutParams) r15).leftMargin;
        r83 = ((LinearLayout.LayoutParams) r15).rightMargin;
        goto L25
    L85:
        return;
    L8:
        r5 = ((getPaddingTop() + r27) - r25) - this.f9741;
        goto L10
    L9:
        r5 = getPaddingTop() + (((r27 - r25) - this.f9741) / 2);
        goto L10
    L32:
        boolean r16 = AbstractC2740.f9803;
        if (getLayoutDirection() != 1) goto L35;
        boolean r17 = true;
    L36:
        int r35 = getPaddingTop();
        int r84 = r27 - r25;
        int r103 = r84 - getPaddingBottom();
        int r85 = (r84 - r35) - getPaddingBottom();
        int r112 = getVirtualChildCount();
        int r122 = this.f9745;
        int r72 = 8388615 & r122;
        int r123 = r122 & 112;
        boolean r133 = this.f9736;
        int[] r143 = this.f9747;
        int[] r152 = this.f9742;
        int r42 = Gravity.getAbsoluteGravity(r72, getLayoutDirection());
        if (r42 == 1) goto L41;
        if (r42 == 5) goto L40;
        int r2 = getPaddingLeft();
    L42:
        if (r17 == false) goto L44;
        int r18 = r112 - 1;
        int r73 = -1;
    L45:
        int r9 = 0;
    L46:
        if (r9 >= r112) goto L92;
        int r53 = (r73 * r9) + r18;
        View r62 = getChildAt(r53);
        if (r62 != null) goto L51;
        int r252 = r18;
    L50:
        int r19 = r35;
    L84:
        r9 = r9 + 1;
        r18 = r252;
        r35 = r19;
        goto L46
    L51:
        r252 = r18;
        if (r62.getVisibility() == 8) goto L50;
        int r43 = r62.getMeasuredWidth();
        int r162 = r62.getMeasuredHeight();
        C2778 r110 = (C2778) r62.getLayoutParams();
        int r272 = r2;
        if (r133 == false) goto L58;
        r19 = r35;
        if (((LinearLayout.LayoutParams) r110).height == (-1)) goto L59;
        int r36 = r62.getBaseline();
    L60:
        int r22 = ((LinearLayout.LayoutParams) r110).gravity;
        if (r22 >= 0) goto L63;
        r22 = r123;
    L63:
        int r28 = r22 & 112;
        if (r28 != 16) goto L66;
        int r29 = (((r85 - r162) / 2) + r19) + ((LinearLayout.LayoutParams) r110).topMargin;
        int r37 = ((LinearLayout.LayoutParams) r110).bottomMargin;
    L73:
        r29 = r29 - r37;
    L79:
        if (m5969(r53) == false) goto L81;
        int r38 = r272 + this.f9748;
    L82:
        int r39 = r38 + ((LinearLayout.LayoutParams) r110).leftMargin;
        r62.layout(r39, r29, r39 + r43, r29 + r162);
        r2 = (r43 + ((LinearLayout.LayoutParams) r110).rightMargin) + r39;
        goto L84
    L81:
        r38 = r272;
        goto L82
    L66:
        if (r28 != 48) goto L68;
        r29 = r19 + ((LinearLayout.LayoutParams) r110).topMargin;
        if (r36 == (-1)) goto L79;
        r29 = (r143[1] - r36) + r29;
        goto L79
    L68:
        if (r28 == 80) goto L70;
        r29 = r19;
        goto L79
    L70:
        r29 = (r103 - r162) - ((LinearLayout.LayoutParams) r110).bottomMargin;
        if (r36 == (-1)) goto L79;
        r37 = r152[2] - (r62.getMeasuredHeight() - r36);
    L59:
        r36 = -1;
        goto L60
    L58:
        r19 = r35;
        goto L59
    L92:
        return;
    L44:
        r73 = 1;
        r18 = 0;
        goto L45
    L40:
        r2 = ((getPaddingLeft() + r26) - r24) - this.f9741;
        goto L42
    L41:
        r2 = getPaddingLeft() + (((r26 - r24) - this.f9741) / 2);
        goto L42
    L35:
        r17 = false;
        goto L36
    }

    @Override // android.view.View
    public void onMeasure(int r39, int r40) {
        AbstractC2730 r0 = this;
        int r7 = -2;
        int r9 = 0;
        int r10 = 1073741824;
        int r11 = 8;
        if (r0.f9739 != 1) goto L171;
        r0.f9741 = 0;
        int r15 = r0.getVirtualChildCount();
        int r1 = View.MeasureSpec.getMode(r39);
        int r2 = View.MeasureSpec.getMode(r40);
        int r3 = r0.f9744;
        boolean r4 = r0.f9740;
        int r5 = 0;
        int r6 = 0;
        int r8 = 0;
        boolean r19 = false;
        int r22 = 0;
        boolean r23 = false;
        boolean r24 = true;
        float r16 = 0.0f;
        int r14 = 0;
    L5:
        if (r5 >= r15) goto L74;
        int r25 = r1;
        View r12 = r0.getChildAt(r5);
        if (r12 != null) goto L11;
        r0.f9741 = r0.f9741;
    L9:
        int r29 = r2;
        int r72 = r3;
        boolean r28 = r4;
        int r13 = r5;
        int r122 = r25;
    L73:
        r5 = r13 + 1;
        r3 = r72;
        r1 = r122;
        r4 = r28;
        r2 = r29;
        r7 = -2;
        r10 = 1073741824;
        r11 = 8;
        goto L5
    L11:
        if (r12.getVisibility() == r11) goto L9;
        if (r0.m5969(r5) == false) goto L16;
        r0.f9741 += r0.f9737;
    L16:
        C2778 r112 = (C2778) r12.getLayoutParams();
        float r123 = ((LinearLayout.LayoutParams) r112).weight;
        r16 = r16 + r123;
        if (r2 != r10) goto L24;
        if (((LinearLayout.LayoutParams) r112).height != 0) goto L24;
        if (r123 <= 0.0f) goto L24;
        int r102 = r0.f9741;
        r0.f9741 = Math.max(r102, (((LinearLayout.LayoutParams) r112).topMargin + r102) + ((LinearLayout.LayoutParams) r112).bottomMargin);
        View r30 = r12;
        r29 = r2;
        r72 = r3;
        r28 = r4;
        r13 = r5;
        r19 = true;
        r122 = r25;
    L40:
        if (r72 >= 0) goto L42;
    L44:
        if (r13 >= r72) goto L50;
        if (((LinearLayout.LayoutParams) r112).weight <= 0.0f) goto L50;
        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
    L50:
        if (r122 != 1073741824) goto L52;
    L54:
        boolean r17 = false;
    L55:
        int r32 = ((LinearLayout.LayoutParams) r112).leftMargin + ((LinearLayout.LayoutParams) r112).rightMargin;
        int r52 = r30.getMeasuredWidth() + r32;
        r9 = Math.max(r9, r52);
        int r103 = r30.getMeasuredState();
        boolean r302 = r17;
        int r18 = View.combineMeasuredStates(r22, r103);
        if (r24 == false) goto L60;
        r22 = r18;
        if (((LinearLayout.LayoutParams) r112).width != (-1)) goto L61;
        boolean r110 = true;
    L63:
        if (((LinearLayout.LayoutParams) r112).weight <= 0.0f) goto L68;
        if (r302 == true) goto L67;
        r32 = r52;
    L67:
        r8 = Math.max(r8, r32);
    L72:
        r24 = r110;
        goto L73
    L68:
        if (r302 == true) goto L71;
        r32 = r52;
    L71:
        r6 = Math.max(r6, r32);
    L61:
        r110 = false;
        goto L63
    L60:
        r22 = r18;
        goto L61
    L52:
        if (((LinearLayout.LayoutParams) r112).width != (-1)) goto L54;
        r17 = true;
        r23 = true;
        goto L55
    L42:
        if (r72 != (r13 + 1)) goto L44;
        r0.f9735 = r0.f9741;
    L24:
        if (((LinearLayout.LayoutParams) r112).height == 0) goto L26;
    L28:
        int r104 = Integer.MIN_VALUE;
    L30:
        if (r16 != 0.0f) goto L33;
        int r124 = r5;
        int r53 = r0.f9741;
    L34:
        r29 = r2;
        r28 = r4;
        r72 = r3;
        r13 = r124;
        r122 = r25;
        r0.measureChildWithMargins(r12, r39, 0, r40, r53);
        if (r104 == Integer.MIN_VALUE) goto L37;
        ((LinearLayout.LayoutParams) r112).height = r104;
    L37:
        int r33 = r12.getMeasuredHeight();
        int r54 = r0.f9741;
        r30 = r12;
        r0.f9741 = Math.max(r54, ((r54 + r33) + ((LinearLayout.LayoutParams) r112).topMargin) + ((LinearLayout.LayoutParams) r112).bottomMargin);
        if (r28 == false) goto L40;
        r14 = Math.max(r33, r14);
        goto L40
    L33:
        r124 = r5;
        r53 = 0;
        goto L34
    L26:
        if (r123 <= 0.0f) goto L28;
        ((LinearLayout.LayoutParams) r112).height = r7;
        r104 = 0;
        goto L30
    L74:
        int r125 = r1;
        int r292 = r2;
        boolean r282 = r4;
        int r111 = r22;
        int r42 = r40;
        if (r0.f9741 <= 0) goto L80;
        if (r0.m5969(r15) == false) goto L80;
        r0.f9741 += r0.f9737;
    L80:
        if (r282 == true) goto L82;
    L94:
        int r105 = (r0.getPaddingBottom() + r0.getPaddingTop()) + r0.f9741;
        r0.f9741 = r105;
        int r55 = View.resolveSizeAndState(Math.max(r105, r0.getSuggestedMinimumHeight()), r42, 0);
        int r73 = (r55 & 16777215) - r0.f9741;
        if (r19 == true) goto L115;
        if (r73 != 0) goto L98;
    L100:
        r6 = Math.max(r6, r8);
        if (r282 == true) goto L103;
    L156:
        if (r24 == false) goto L158;
    L160:
        r6 = r9;
    L161:
        r0.setMeasuredDimension(View.resolveSizeAndState(Math.max((r0.getPaddingRight() + r0.getPaddingLeft()) + r6, r0.getSuggestedMinimumWidth()), r39, r111), r55);
        if (r23 == false) goto L396;
        int r26 = View.MeasureSpec.makeMeasureSpec(r0.getMeasuredWidth(), 1073741824);
        int r92 = 0;
    L164:
        if (r92 >= r15) goto L439;
        View r113 = r0.getChildAt(r92);
        if (r113.getVisibility() == 8) goto L170;
        C2778 r62 = (C2778) r113.getLayoutParams();
        if (((LinearLayout.LayoutParams) r62).width != (-1)) goto L170;
        int r74 = ((LinearLayout.LayoutParams) r62).height;
        ((LinearLayout.LayoutParams) r62).height = r113.getMeasuredHeight();
        r0.measureChildWithMargins(r113, r26, 0, r42, 0);
        ((LinearLayout.LayoutParams) r62).height = r74;
    L170:
        r92 = r92 + 1;
        r42 = r40;
        goto L164
    L439:
        return;
    L396:
        return;
    L158:
        if (r125 == 1073741824) goto L160;
    L103:
        if (r292 == 1073741824) goto L156;
        int r34 = 0;
    L105:
        if (r34 >= r15) goto L156;
        View r75 = r0.getChildAt(r34);
        if (r75 == null) goto L114;
        if (r75.getVisibility() == 8) goto L114;
        if (((LinearLayout.LayoutParams) ((C2778) r75.getLayoutParams())).weight <= 0.0f) goto L114;
        r75.measure(View.MeasureSpec.makeMeasureSpec(r75.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r14, 1073741824));
    L114:
        r34 = r34 + 1;
        goto L105
    L98:
        if (r16 <= 0.0f) goto L100;
    L115:
        float r82 = r0.f9743;
        if (r82 <= 0.0f) goto L118;
        r16 = r82;
    L118:
        r0.f9741 = 0;
        int r83 = r111;
        int r114 = 0;
    L119:
        if (r114 >= r15) goto L155;
        View r106 = r0.getChildAt(r114);
        if (r106.getVisibility() != 8) goto L123;
        int r172 = r114;
    L154:
        r114 = r172 + 1;
        goto L119
    L123:
        C2778 r115 = (C2778) r106.getLayoutParams();
        float r132 = ((LinearLayout.LayoutParams) r115).weight;
        if (r132 <= 0.0f) goto L140;
        int r142 = (int) ((r73 * r132) / r16);
        r16 = r16 - r132;
        r73 = r73 - r142;
        r172 = r114;
        int r116 = ViewGroup.getChildMeasureSpec(r39, ((r0.getPaddingRight() + r0.getPaddingLeft()) + ((LinearLayout.LayoutParams) r115).leftMargin) + ((LinearLayout.LayoutParams) r115).rightMargin, ((LinearLayout.LayoutParams) r115).width);
        if (((LinearLayout.LayoutParams) r115).height != 0) goto L134;
        int r133 = 1073741824;
        if (r292 != 1073741824) goto L135;
        if (r142 > 0) goto L133;
        r142 = 0;
    L133:
        r106.measure(r116, View.MeasureSpec.makeMeasureSpec(r142, 1073741824));
    L139:
        r83 = View.combineMeasuredStates(r83, r106.getMeasuredState() & (-256));
    L141:
        int r117 = ((LinearLayout.LayoutParams) r115).leftMargin + ((LinearLayout.LayoutParams) r115).rightMargin;
        int r134 = r106.getMeasuredWidth() + r117;
        r9 = Math.max(r9, r134);
        if (r125 == 1073741824) goto L146;
        int r118 = -1;
        if (((LinearLayout.LayoutParams) r115).width != (-1)) goto L147;
        r134 = r117;
    L147:
        r6 = Math.max(r6, r134);
        if (r24 == true) goto L150;
    L152:
        boolean r119 = false;
    L153:
        int r135 = r0.f9741;
        r0.f9741 = Math.max(r135, ((r106.getMeasuredHeight() + r135) + ((LinearLayout.LayoutParams) r115).topMargin) + ((LinearLayout.LayoutParams) r115).bottomMargin);
        r24 = r119;
        goto L154
    L150:
        if (((LinearLayout.LayoutParams) r115).width != r118) goto L152;
        r119 = true;
        goto L153
    L146:
        r118 = -1;
    L135:
        int r143 = r106.getMeasuredHeight() + r142;
        if (r143 >= 0) goto L138;
        r143 = 0;
    L138:
        r106.measure(r116, View.MeasureSpec.makeMeasureSpec(r143, r133));
        goto L139
    L134:
        r133 = 1073741824;
        goto L135
    L140:
        r172 = r114;
        goto L141
    L155:
        r0.f9741 = (r0.getPaddingBottom() + r0.getPaddingTop()) + r0.f9741;
        r111 = r83;
        goto L156
    L82:
        if (r292 == Integer.MIN_VALUE) goto L84;
        if (r292 != 0) goto L94;
    L84:
        r0.f9741 = 0;
        int r56 = 0;
    L85:
        if (r56 >= r15) goto L94;
        View r76 = r0.getChildAt(r56);
        if (r76 != null) goto L90;
        r0.f9741 = r0.f9741;
    L93:
        r56 = r56 + 1;
        goto L85
    L90:
        if (r76.getVisibility() == 8) goto L93;
        C2778 r77 = (C2778) r76.getLayoutParams();
        int r107 = r0.f9741;
        r0.f9741 = Math.max(r107, ((r107 + r14) + ((LinearLayout.LayoutParams) r77).topMargin) + ((LinearLayout.LayoutParams) r77).bottomMargin);
        goto L93
    L171:
        int r27 = r39;
        r0.f9741 = 0;
        int r63 = r0.getVirtualChildCount();
        int r78 = View.MeasureSpec.getMode(r27);
        int r84 = View.MeasureSpec.getMode(r40);
        if (r0.f9747 != null) goto L174;
    L175:
        r0.f9747 = new int[4];
        r0.f9742 = new int[4];
    L176:
        int[] r108 = r0.f9747;
        int[] r1110 = r0.f9742;
        r108[3] = -1;
        char r136 = 2;
        r108[2] = -1;
        r108[1] = -1;
        r108[0] = -1;
        r1110[3] = -1;
        r1110[2] = -1;
        r1110[1] = -1;
        r1110[0] = -1;
        boolean r144 = r0.f9736;
        boolean r152 = r0.f9740;
        if (r78 != 1073741824) goto L179;
        boolean r162 = true;
    L180:
        float r283 = 0.0f;
        boolean r293 = true;
        int r120 = 0;
        int r35 = 0;
        int r43 = 0;
        int r57 = 0;
        int r93 = 0;
        int r126 = 0;
        boolean r192 = false;
        boolean r222 = false;
    L181:
        if (r120 >= r63) goto L256;
        char r303 = r136;
        View r137 = r0.getChildAt(r120);
        if (r137 != null) goto L185;
        r0.f9741 = r0.f9741;
        int r332 = r120;
        int r121 = r43;
        int[] r31 = r108;
        int[] r322 = r1110;
        boolean r342 = r144;
        boolean r352 = r152;
    L255:
        r43 = r121;
        r120 = r332 + 1;
        r136 = r303;
        r108 = r31;
        r1110 = r322;
        r144 = r342;
        r152 = r352;
        goto L181
    L185:
        int r312 = r35;
        if (r137.getVisibility() != 8) goto L189;
        r27 = r39;
        r332 = r120;
        r121 = r43;
        r322 = r1110;
        r342 = r144;
        r352 = r152;
        r35 = r312;
        r31 = r108;
        goto L255
    L189:
        if (r0.m5969(r120) == false) goto L191;
        r0.f9741 += r0.f9748;
    L191:
        C2778 r210 = (C2778) r137.getLayoutParams();
        float r36 = ((LinearLayout.LayoutParams) r210).weight;
        r283 = r283 + r36;
        int r323 = r120;
        if (r78 != 1073741824) goto L204;
        if (((LinearLayout.LayoutParams) r210).width != 0) goto L204;
        if (r36 <= 0.0f) goto L204;
        if (r162 == false) goto L199;
        r0.f9741 = (((LinearLayout.LayoutParams) r210).leftMargin + ((LinearLayout.LayoutParams) r210).rightMargin) + r0.f9741;
    L200:
        if (r144 == false) goto L202;
        int r37 = View.MeasureSpec.makeMeasureSpec(0, 0);
        r137.measure(r37, r37);
        View r362 = r137;
        r342 = r144;
        r352 = r152;
        int r138 = r312;
        r332 = r323;
        C2778 r145 = r210;
        r31 = r108;
        r322 = r1110;
        r27 = r39;
        int r109 = r43;
        int r1111 = r57;
    L223:
        int r127 = 1073741824;
    L224:
        if (r84 != r127) goto L226;
    L228:
        boolean r128 = false;
    L229:
        int r38 = ((LinearLayout.LayoutParams) r145).topMargin + ((LinearLayout.LayoutParams) r145).bottomMargin;
        int r58 = r362.getMeasuredHeight() + r38;
        r126 = View.combineMeasuredStates(r126, r362.getMeasuredState());
        if (r342 == false) goto L237;
        int r153 = r362.getBaseline();
        boolean r363 = r128;
        if (r153 == (-1)) goto L238;
        int r129 = ((LinearLayout.LayoutParams) r145).gravity;
        if (r129 >= 0) goto L236;
        r129 = r0.f9745;
    L236:
        int r130 = (((r129 & 112) >> 4) & (-2)) >> 1;
        r31[r130] = Math.max(r31[r130], r153);
        r322[r130] = Math.max(r322[r130], r58 - r153);
    L238:
        int r131 = Math.max(r138, r58);
        if (r293 == true) goto L241;
    L243:
        boolean r139 = false;
    L245:
        if (((LinearLayout.LayoutParams) r145).weight <= 0.0f) goto L250;
        if (r363 == true) goto L249;
        r38 = r58;
    L249:
        r57 = Math.max(r1111, r38);
        int r310 = r109;
    L254:
        int r294 = r310;
        r35 = r131;
        r121 = r294;
        r293 = r139;
        goto L255
    L250:
        if (r363 == true) goto L253;
        r38 = r58;
    L253:
        r310 = Math.max(r109, r38);
        r57 = r1111;
        goto L254
    L241:
        if (((LinearLayout.LayoutParams) r145).height != (-1)) goto L243;
        r139 = true;
        goto L245
    L237:
        r363 = r128;
        goto L238
    L226:
        if (((LinearLayout.LayoutParams) r145).height != (-1)) goto L228;
        r128 = true;
        r192 = true;
        goto L229
    L202:
        r362 = r137;
        r342 = r144;
        r352 = r152;
        r222 = true;
        r138 = r312;
        r332 = r323;
        r127 = 1073741824;
        r145 = r210;
        r31 = r108;
        r322 = r1110;
        r27 = r39;
        r109 = r43;
        r1111 = r57;
        goto L224
    L199:
        int r140 = r0.f9741;
        r0.f9741 = Math.max(r140, (((LinearLayout.LayoutParams) r210).leftMargin + r140) + ((LinearLayout.LayoutParams) r210).rightMargin);
    L204:
        if (((LinearLayout.LayoutParams) r210).width == 0) goto L206;
    L208:
        int r141 = Integer.MIN_VALUE;
    L210:
        if (r283 != 0.0f) goto L213;
        int r311 = r0.f9741;
    L214:
        r322 = r1110;
        r1111 = r57;
        r332 = r323;
        r342 = r144;
        r352 = r152;
        int r154 = r141;
        r145 = r210;
        r138 = r312;
        r27 = r39;
        r31 = r108;
        r109 = r43;
        r0.measureChildWithMargins(r137, r27, r311, r40, 0);
        if (r154 == Integer.MIN_VALUE) goto L217;
        ((LinearLayout.LayoutParams) r145).width = r154;
    L217:
        int r313 = r137.getMeasuredWidth();
        if (r162 == false) goto L220;
        r362 = r137;
        r0.f9741 = ((((LinearLayout.LayoutParams) r145).leftMargin + r313) + ((LinearLayout.LayoutParams) r145).rightMargin) + r0.f9741;
    L221:
        if (r352 == false) goto L223;
        r93 = Math.max(r313, r93);
        goto L223
    L220:
        r362 = r137;
        int r146 = r0.f9741;
        r0.f9741 = Math.max(r146, ((r146 + r313) + ((LinearLayout.LayoutParams) r145).leftMargin) + ((LinearLayout.LayoutParams) r145).rightMargin);
        goto L221
    L213:
        r311 = 0;
        goto L214
    L206:
        if (r36 <= 0.0f) goto L208;
        ((LinearLayout.LayoutParams) r210).width = -2;
        r141 = 0;
        goto L210
    L256:
        int[] r314 = r108;
        int[] r324 = r1110;
        char r304 = r136;
        boolean r343 = r144;
        boolean r353 = r152;
        int r1310 = r35;
        int r1010 = r43;
        int r1112 = r57;
        if (r0.f9741 > 0) goto L259;
    L261:
        int r147 = r314[1];
        if (r147 == (-1)) goto L264;
    L271:
        int r315 = Math.max(r1310, Math.max(r324[3], Math.max(r324[0], Math.max(r324[1], r324[r304]))) + Math.max(r314[3], Math.max(r314[0], Math.max(r147, r314[r304]))));
    L272:
        if (r353 == true) goto L274;
    L289:
        int r1311 = (r0.getPaddingRight() + r0.getPaddingLeft()) + r0.f9741;
        r0.f9741 = r1311;
        int r148 = View.resolveSizeAndState(Math.max(r1311, r0.getSuggestedMinimumWidth()), r27, 0);
        int r59 = (r148 & 16777215) - r0.f9741;
        if (r222 == true) goto L311;
        if (r59 != 0) goto L293;
    L295:
        int r510 = Math.max(r1010, r1112);
        if (r353 == true) goto L298;
    L310:
        int r223 = r148;
        int r173 = -16777216;
        int r21 = 0;
    L381:
        if (r293 == false) goto L383;
    L385:
        r0.setMeasuredDimension(r223 | (r126 & r173), View.resolveSizeAndState(Math.max((r0.getPaddingBottom() + r0.getPaddingTop()) + r315, r0.getSuggestedMinimumHeight()), r40, r126 << 16));
        if (r192 == false) goto L438;
        int r44 = View.MeasureSpec.makeMeasureSpec(r0.getMeasuredHeight(), 1073741824);
        int r94 = r21;
    L388:
        if (r94 >= r63) goto L440;
        View r149 = r0.getChildAt(r94);
        if (r149.getVisibility() == 8) goto L395;
        C2778 r79 = (C2778) r149.getLayoutParams();
        if (((LinearLayout.LayoutParams) r79).height != (-1)) goto L395;
        int r85 = ((LinearLayout.LayoutParams) r79).width;
        ((LinearLayout.LayoutParams) r79).width = r149.getMeasuredWidth();
        r0.measureChildWithMargins(r149, r27, 0, r44, 0);
        ((LinearLayout.LayoutParams) r79).width = r85;
    L395:
        r94 = r94 + 1;
        r0 = this;
        r27 = r39;
        goto L388
    L440:
        return;
    L438:
        return;
    L383:
        if (r84 == 1073741824) goto L385;
        r315 = r510;
        goto L385
    L298:
        if (r78 == 1073741824) goto L310;
        int r710 = 0;
    L300:
        if (r710 >= r63) goto L310;
        View r1011 = r0.getChildAt(r710);
        if (r1011 == null) goto L309;
        if (r1011.getVisibility() == 8) goto L309;
        if (((LinearLayout.LayoutParams) ((C2778) r1011.getLayoutParams())).weight <= 0.0f) goto L309;
        r1011.measure(View.MeasureSpec.makeMeasureSpec(r93, 1073741824), View.MeasureSpec.makeMeasureSpec(r1011.getMeasuredHeight(), 1073741824));
    L309:
        r710 = r710 + 1;
        goto L300
    L293:
        if (r283 <= 0.0f) goto L295;
    L311:
        float r316 = r0.f9743;
        if (r316 <= 0.0f) goto L314;
        r283 = r316;
    L314:
        r314[3] = -1;
        r314[r304] = -1;
        r314[1] = -1;
        r314[0] = -1;
        r324[3] = -1;
        r324[r304] = -1;
        r324[1] = -1;
        r324[0] = -1;
        r0.f9741 = 0;
        r315 = -1;
        int r95 = 0;
    L315:
        if (r95 >= r63) goto L369;
        View r1113 = r0.getChildAt(r95);
        if (r1113 != null) goto L319;
    L320:
        int r224 = r148;
    L368:
        r95 = r95 + 1;
        r148 = r224;
        goto L315
    L319:
        if (r1113.getVisibility() == 8) goto L320;
        C2778 r1410 = (C2778) r1113.getLayoutParams();
        float r155 = ((LinearLayout.LayoutParams) r1410).weight;
        if (r155 <= 0.0f) goto L338;
        int r1312 = (int) ((r59 * r155) / r283);
        r283 = r283 - r155;
        r59 = r59 - r1312;
        r224 = r148;
        int r150 = ViewGroup.getChildMeasureSpec(r40, ((r0.getPaddingBottom() + r0.getPaddingTop()) + ((LinearLayout.LayoutParams) r1410).topMargin) + ((LinearLayout.LayoutParams) r1410).bottomMargin, ((LinearLayout.LayoutParams) r1410).height);
        if (((LinearLayout.LayoutParams) r1410).width != 0) goto L332;
        int r156 = 1073741824;
        if (r78 != 1073741824) goto L333;
        if (r1312 > 0) goto L331;
        r1312 = 0;
    L331:
        r1113.measure(View.MeasureSpec.makeMeasureSpec(r1312, 1073741824), r150);
    L337:
        r126 = View.combineMeasuredStates(r126, r1113.getMeasuredState() & (-16777216));
    L339:
        if (r162 == false) goto L342;
        r0.f9741 = ((r1113.getMeasuredWidth() + ((LinearLayout.LayoutParams) r1410).leftMargin) + ((LinearLayout.LayoutParams) r1410).rightMargin) + r0.f9741;
    L343:
        if (r84 != 1073741824) goto L345;
    L347:
        boolean r151 = false;
    L348:
        int r1313 = ((LinearLayout.LayoutParams) r1410).topMargin + ((LinearLayout.LayoutParams) r1410).bottomMargin;
        int r157 = r1113.getMeasuredHeight() + r1313;
        r315 = Math.max(r315, r157);
        if (r151 == true) goto L352;
        r1313 = r157;
    L352:
        int r158 = Math.max(r1010, r1313);
        if (r293 == false) goto L357;
        int r1314 = -1;
        if (((LinearLayout.LayoutParams) r1410).height != (-1)) goto L358;
        boolean r1012 = true;
    L359:
        if (r343 == false) goto L367;
        int r1114 = r1113.getBaseline();
        if (r1114 == r1314) goto L367;
        int r1315 = ((LinearLayout.LayoutParams) r1410).gravity;
        if (r1315 >= 0) goto L365;
        r1315 = r0.f9745;
    L365:
        int r1316 = (((r1315 & 112) >> 4) & (-2)) >> 1;
        r314[r1316] = Math.max(r314[r1316], r1114);
        r324[r1316] = Math.max(r324[r1316], r157 - r1114);
    L367:
        r293 = r1012;
        r1010 = r158;
    L358:
        r1012 = false;
        goto L359
    L357:
        r1314 = -1;
        goto L358
    L345:
        if (((LinearLayout.LayoutParams) r1410).height != (-1)) goto L347;
        r151 = true;
        goto L348
    L342:
        int r159 = r0.f9741;
        r0.f9741 = Math.max(r159, ((r1113.getMeasuredWidth() + r159) + ((LinearLayout.LayoutParams) r1410).leftMargin) + ((LinearLayout.LayoutParams) r1410).rightMargin);
    L333:
        int r1317 = r1113.getMeasuredWidth() + r1312;
        if (r1317 >= 0) goto L336;
        r1317 = 0;
    L336:
        r1113.measure(View.MeasureSpec.makeMeasureSpec(r1317, r156), r150);
        goto L337
    L332:
        r156 = 1073741824;
        goto L333
    L338:
        r224 = r148;
        goto L339
    L369:
        r223 = r148;
        r173 = -16777216;
        r0.f9741 = (r0.getPaddingRight() + r0.getPaddingLeft()) + r0.f9741;
        int r160 = r314[1];
        if (r160 == (-1)) goto L372;
    L379:
        r21 = 0;
        r315 = Math.max(r315, Math.max(r324[3], Math.max(r324[0], Math.max(r324[1], r324[r304]))) + Math.max(r314[3], Math.max(r314[0], Math.max(r160, r314[r304]))));
    L380:
        r510 = r1010;
        goto L381
    L372:
        if (r314[0] != (-1)) goto L379;
        if (r314[r304] != (-1)) goto L379;
        if (r314[3] != (-1)) goto L379;
        r21 = 0;
        goto L380
    L274:
        if (r78 == Integer.MIN_VALUE) goto L276;
        if (r78 != 0) goto L289;
    L276:
        r0.f9741 = 0;
        int r161 = 0;
    L277:
        if (r161 >= r63) goto L289;
        View r511 = r0.getChildAt(r161);
        if (r511 != null) goto L282;
        r0.f9741 = r0.f9741;
    L288:
        r161 = r161 + 1;
        goto L277
    L282:
        if (r511.getVisibility() == 8) goto L288;
        C2778 r512 = (C2778) r511.getLayoutParams();
        if (r162 == false) goto L287;
        r0.f9741 = ((((LinearLayout.LayoutParams) r512).leftMargin + r93) + ((LinearLayout.LayoutParams) r512).rightMargin) + r0.f9741;
        goto L288
    L287:
        int r1318 = r0.f9741;
        r0.f9741 = Math.max(r1318, ((r1318 + r93) + ((LinearLayout.LayoutParams) r512).leftMargin) + ((LinearLayout.LayoutParams) r512).rightMargin);
        goto L288
    L264:
        if (r314[0] != (-1)) goto L271;
        if (r314[r304] != (-1)) goto L271;
        if (r314[3] != (-1)) goto L271;
        r315 = r1310;
        goto L272
    L259:
        if (r0.m5969(r63) == false) goto L261;
        r0.f9741 += r0.f9748;
        goto L261
    L179:
        r162 = false;
        goto L180
    L174:
        if (r0.f9742 != null) goto L176;
        goto L175
    }

    public void setBaselineAligned(boolean r1) {
        this.f9736 = r1;
    }

    public void setBaselineAlignedChildIndex(int r3) {
        if (r3 < 0) goto L8;
        if (r3 >= getChildCount()) goto L8;
        this.f9744 = r3;
        return;
    L8:
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable r3) {
        if (r3 != this.f9746) goto L5;
        return;
    L5:
        this.f9746 = r3;
        boolean r0 = false;
        if (r3 == null) goto L8;
        this.f9748 = r3.getIntrinsicWidth();
        this.f9737 = r3.getIntrinsicHeight();
    L9:
        if (r3 != null) goto L11;
        r0 = true;
    L11:
        setWillNotDraw(r0);
        requestLayout();
        return;
    L8:
        this.f9748 = 0;
        this.f9737 = 0;
        goto L9
    }

    public void setDividerPadding(int r1) {
        this.f9738 = r1;
    }

    public void setGravity(int r2) {
        if (this.f9745 != r2) goto L5;
        return;
    L5:
        if ((8388615 & r2) != 0) goto L8;
        r2 = r2 | 8388611;
    L8:
        if ((r2 & 112) != 0) goto L10;
        r2 = r2 | 48;
    L10:
        this.f9745 = r2;
        requestLayout();
    }

    public void setHorizontalGravity(int r3) {
        int r32 = r3 & 8388615;
        int r1 = this.f9745;
        if ((8388615 & r1) == r32) goto L6;
        this.f9745 = r32 | ((-8388616) & r1);
        requestLayout();
        return;
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
        this.f9740 = r1;
    }

    public void setOrientation(int r2) {
        if (this.f9739 == r2) goto L6;
        this.f9739 = r2;
        requestLayout();
        return;
    }

    public void setShowDividers(int r2) {
        if (r2 == this.f9749) goto L5;
        requestLayout();
    L5:
        this.f9749 = r2;
    }

    public void setVerticalGravity(int r3) {
        int r32 = r3 & 112;
        int r0 = this.f9745;
        if ((r0 & 112) == r32) goto L6;
        this.f9745 = r32 | (r0 & (-113));
        requestLayout();
        return;
    }

    public void setWeightSum(float r2) {
        this.f9743 = Math.max(0.0f, r2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final boolean m5969(int r5) {
        if (r5 != 0) goto L9;
        if ((this.f9749 & 1) == 0) goto L7;
        return true;
    L7:
        return false;
    L9:
        if (r5 != getChildCount()) goto L15;
        if ((this.f9749 & 4) == 0) goto L13;
        return true;
    L13:
        return false;
    L15:
        if ((this.f9749 & 2) == 0) goto L22;
        int r52 = r5 - 1;
    L17:
        if (r52 < 0) goto L22;
        if (getChildAt(r52).getVisibility() != 8) goto L20;
        r52 = r52 - 1;
        goto L17
    L20:
        return true;
    L22:
        return false;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m5970(Canvas r5, int r6) {
        this.f9746.setBounds(getPaddingLeft() + this.f9738, r6, (getWidth() - getPaddingRight()) - this.f9738, this.f9737 + r6);
        this.f9746.draw(r5);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m5971(Canvas r6, int r7) {
        this.f9746.setBounds(r7, getPaddingTop() + this.f9738, this.f9748 + r7, (getHeight() - getPaddingBottom()) - this.f9738);
        this.f9746.draw(r6);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public C2778 mo54(AttributeSet r3) {
        return new C2778(getContext(), r3);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public C2778 mo55(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C2778) == false) goto L7;
        return new C2778((C2778) r2);
    L7:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L11;
        return new C2778((ViewGroup.MarginLayoutParams) r2);
    L11:
        return new C2778(r2);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public C2778 mo57() {
        int r0 = this.f9739;
        if (r0 != 0) goto L7;
        return new C2778(-2, -2);
    L7:
        if (r0 == 1) goto L9;
        return null;
    L9:
        return new C2778(-1, -2);
    }
}
