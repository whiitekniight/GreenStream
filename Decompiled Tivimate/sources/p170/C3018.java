package p170;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import p087.C2135;
import ﹳٴ.ﹳٴ;

/* JADX INFO: renamed from: ˊˋ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C3018 {

    /* JADX INFO: renamed from: ʽ */
    public static int f10573;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f10574;

    /* JADX INFO: renamed from: ﹳٴ */
    public final AccessibilityNodeInfo f10575;

    public C3018(AccessibilityNodeInfo r2) {
        this.f10574 = -1;
        this.f10575 = r2;
    }

    /* JADX INFO: renamed from: ˈ */
    public static String m6372(int r1) {
        if (r1 != 1) goto L5;
        return "ACTION_FOCUS";
    L5:
        if (r1 == 2) goto L92;
        switch(r1) {
            case 4: goto L90;
            case 8: goto L88;
            case 16: goto L86;
            case 32: goto L84;
            case 64: goto L82;
            case 128: goto L80;
            case 256: goto L78;
            case 512: goto L76;
            case 1024: goto L74;
            case 2048: goto L72;
            case 4096: goto L70;
            case 8192: goto L68;
            case 16384: goto L66;
            case 32768: goto L64;
            case 65536: goto L62;
            case 131072: goto L60;
            case 262144: goto L58;
            case 524288: goto L56;
            case 2097152: goto L54;
            case 16908354: goto L52;
            case 16908382: goto L50;
            default: goto L7;
        };
    L7:
        switch(r1) {
            case 16908342: goto L48;
            case 16908343: goto L46;
            case 16908344: goto L44;
            case 16908345: goto L42;
            case 16908346: goto L40;
            case 16908347: goto L38;
            case 16908348: goto L36;
            case 16908349: goto L34;
            default: goto L8;
        };
    L8:
        switch(r1) {
            case 16908356: goto L32;
            case 16908357: goto L30;
            case 16908358: goto L28;
            case 16908359: goto L26;
            case 16908360: goto L24;
            case 16908361: goto L22;
            case 16908362: goto L20;
            default: goto L9;
        };
    L9:
        switch(r1) {
            case 16908372: goto L18;
            case 16908373: goto L16;
            case 16908374: goto L14;
            case 16908375: goto L12;
            default: goto L10;
        };
    L10:
        return "ACTION_UNKNOWN";
    L12:
        return "ACTION_DRAG_CANCEL";
    L14:
        return "ACTION_DRAG_DROP";
    L16:
        return "ACTION_DRAG_START";
    L18:
        return "ACTION_IME_ENTER";
    L20:
        return "ACTION_PRESS_AND_HOLD";
    L22:
        return "ACTION_PAGE_RIGHT";
    L24:
        return "ACTION_PAGE_LEFT";
    L26:
        return "ACTION_PAGE_DOWN";
    L28:
        return "ACTION_PAGE_UP";
    L30:
        return "ACTION_HIDE_TOOLTIP";
    L32:
        return "ACTION_SHOW_TOOLTIP";
    L34:
        return "ACTION_SET_PROGRESS";
    L36:
        return "ACTION_CONTEXT_CLICK";
    L38:
        return "ACTION_SCROLL_RIGHT";
    L40:
        return "ACTION_SCROLL_DOWN";
    L42:
        return "ACTION_SCROLL_LEFT";
    L44:
        return "ACTION_SCROLL_UP";
    L46:
        return "ACTION_SCROLL_TO_POSITION";
    L48:
        return "ACTION_SHOW_ON_SCREEN";
    L50:
        return "ACTION_SCROLL_IN_DIRECTION";
    L52:
        return "ACTION_MOVE_WINDOW";
    L54:
        return "ACTION_SET_TEXT";
    L56:
        return "ACTION_COLLAPSE";
    L58:
        return "ACTION_EXPAND";
    L60:
        return "ACTION_SET_SELECTION";
    L62:
        return "ACTION_CUT";
    L64:
        return "ACTION_PASTE";
    L66:
        return "ACTION_COPY";
    L68:
        return "ACTION_SCROLL_BACKWARD";
    L70:
        return "ACTION_SCROLL_FORWARD";
    L72:
        return "ACTION_PREVIOUS_HTML_ELEMENT";
    L74:
        return "ACTION_NEXT_HTML_ELEMENT";
    L76:
        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
    L78:
        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
    L80:
        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
    L82:
        return "ACTION_ACCESSIBILITY_FOCUS";
    L84:
        return "ACTION_LONG_CLICK";
    L86:
        return "ACTION_CLICK";
    L88:
        return "ACTION_CLEAR_SELECTION";
    L90:
        return "ACTION_SELECT";
    L92:
        return "ACTION_CLEAR_FOCUS";
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L5;
        return true;
    L5:
        if (r4 != null) goto L8;
        return false;
    L8:
        if ((r4 instanceof C3018) == false) goto L23;
        C3018 r42 = (C3018) r4;
        AccessibilityNodeInfo r1 = r42.f10575;
        AccessibilityNodeInfo r2 = this.f10575;
        if (r2 != null) goto L15;
        if (r1 == null) goto L18;
        return false;
    L18:
        if (this.f10574 == r42.f10574) goto L21;
        return false;
    L21:
        return true;
    L15:
        if (r2.equals(r1) == true) goto L18;
        return false;
    L23:
        return false;
    }

    public final int hashCode() {
        AccessibilityNodeInfo r0 = this.f10575;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public final String toString() {
        StringBuilder r1 = new StringBuilder();
        r1.append(super.toString());
        Rect r2 = new Rect();
        m6390(r2);
        r1.append("; boundsInParent: " + r2);
        AccessibilityNodeInfo r3 = this.f10575;
        r3.getBoundsInScreen(r2);
        r1.append("; boundsInScreen: " + r2);
        int r4 = Build.VERSION.SDK_INT;
        if (r4 < 34) goto L5;
        AbstractC3024.m6398(r3, r2);
    L8:
        r1.append("; boundsInWindow: " + r2);
        r1.append("; packageName: ");
        r1.append(r3.getPackageName());
        r1.append("; className: ");
        r1.append(r3.getClassName());
        r1.append("; text: ");
        r1.append(m6382());
        r1.append("; error: ");
        r1.append(r3.getError());
        r1.append("; maxTextLength: ");
        r1.append(r3.getMaxTextLength());
        r1.append("; stateDescription: ");
        if (r4 < 30) goto L11;
        CharSequence r22 = AbstractC3011.m6361(r3);
    L12:
        r1.append(r22);
        r1.append("; contentDescription: ");
        r1.append(r3.getContentDescription());
        r1.append("; supplementalDescription: ");
        if (r4 < 36) goto L15;
        CharSequence r6 = AbstractC3016.m6368(r3);
    L16:
        r1.append(r6);
        r1.append("; tooltipText: ");
        if (r4 < 28) goto L19;
        CharSequence r62 = r3.getTooltipText();
    L20:
        r1.append(r62);
        r1.append("; viewIdResName: ");
        r1.append(r3.getViewIdResourceName());
        r1.append("; uniqueId: ");
        if (r4 < 33) goto L23;
        String r7 = AbstractC3014.m6364(r3);
    L24:
        r1.append(r7);
        r1.append("; checkable: ");
        r1.append(r3.isCheckable());
        r1.append("; checked: ");
        if (r4 < 36) goto L27;
        int r72 = AbstractC3016.m6371(r3);
    L28:
        String r8 = "PARTIAL";
        if (r72 != 1) goto L31;
        String r73 = "TRUE";
    L34:
        r1.append(r73);
        r1.append("; fieldRequired: ");
        if (r4 < 36) goto L37;
        boolean r74 = AbstractC3016.m6369(r3);
    L38:
        r1.append(r74);
        r1.append("; focusable: ");
        r1.append(r3.isFocusable());
        r1.append("; focused: ");
        r1.append(r3.isFocused());
        r1.append("; selected: ");
        r1.append(r3.isSelected());
        r1.append("; clickable: ");
        r1.append(r3.isClickable());
        r1.append("; longClickable: ");
        r1.append(r3.isLongClickable());
        r1.append("; contextClickable: ");
        r1.append(r3.isContextClickable());
        r1.append("; expandedState: ");
        int r75 = 0;
        if (r4 < 36) goto L41;
        int r23 = AbstractC3016.m6370(r3);
    L42:
        if (r23 == 0) goto L50;
        if (r23 == 1) goto L49;
        if (r23 != 2) goto L46;
    L51:
        r1.append(r8);
        r1.append("; enabled: ");
        r1.append(r3.isEnabled());
        r1.append("; password: ");
        r1.append(r3.isPassword());
        r1.append("; scrollable: " + r3.isScrollable());
        r1.append("; containerTitle: ");
        if (r4 < 34) goto L54;
        CharSequence r24 = AbstractC3024.m6399(r3);
    L55:
        r1.append(r24);
        r1.append("; granularScrollingSupported: ");
        r1.append(m6379(67108864));
        r1.append("; importantForAccessibility: ");
        if (r4 < 24) goto L58;
        boolean r25 = r3.isImportantForAccessibility();
    L59:
        r1.append(r25);
        r1.append("; visible: ");
        r1.append(r3.isVisibleToUser());
        r1.append("; isTextSelectable: ");
        if (r4 < 33) goto L62;
        boolean r26 = AbstractC3014.m6365(r3);
    L63:
        r1.append(r26);
        r1.append("; accessibilityDataSensitive: ");
        if (r4 < 34) goto L66;
        boolean r27 = AbstractC3024.m6401(r3);
    L67:
        r1.append(r27);
        r1.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> r28 = r3.getActionList();
        ArrayList r32 = new ArrayList();
        int r42 = r28.size();
        int r5 = 0;
    L68:
        if (r5 >= r42) goto L71;
        r32.add(new C3009(r28.get(r5), 0, null, null, null));
        r5 = r5 + 1;
    L71:
        if (r75 >= r32.size()) goto L81;
        C3009 r29 = (C3009) r32.get(r75);
        int r43 = r29.m6357();
        Object r210 = r29.f10572;
        String r44 = m6372(r43);
        if (r44.equals("ACTION_UNKNOWN") == true) goto L75;
    L77:
        r1.append(r44);
        if (r75 == (r32.size() - 1)) goto L80;
        r1.append(", ");
    L80:
        r75 = r75 + 1;
        goto L71
    L75:
        if (((AccessibilityNodeInfo.AccessibilityAction) r210).getLabel() == null) goto L77;
        r44 = ((AccessibilityNodeInfo.AccessibilityAction) r210).getLabel().toString();
        goto L77
    L81:
        r1.append("]");
        return r1.toString();
    L66:
        r27 = m6379(64);
        goto L67
    L62:
        r26 = m6379(8388608);
        goto L63
    L58:
        r25 = true;
        goto L59
    L54:
        r24 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        goto L55
    L46:
        if (r23 == 3) goto L48;
        r8 = "UNKNOWN";
        goto L51
    L48:
        r8 = "FULL";
        goto L51
    L49:
        r8 = "COLLAPSED";
        goto L51
    L50:
        r8 = "UNDEFINED";
        goto L51
    L41:
        r23 = r3.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        goto L42
    L37:
        r74 = r3.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
        goto L38
    L31:
        if (r72 != 2) goto L33;
        r73 = "PARTIAL";
        goto L34
    L33:
        r73 = "FALSE";
        goto L34
    L27:
        r72 = r3.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", r3.isChecked() ? 1 : 0);
        goto L28
    L23:
        r7 = r3.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        goto L24
    L19:
        r62 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        goto L20
    L15:
        r6 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
        goto L16
    L11:
        r22 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        goto L12
    L5:
        Rect r63 = (Rect) r3.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (r63 == null) goto L8;
        r2.set(r63.left, r63.top, r63.right, r63.bottom);
        goto L8
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final void m6373(int r6, boolean r7) {
        Bundle r0 = this.f10575.getExtras();
        if (r0 == null) goto L10;
        int r3 = r0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~r6);
        if (r7 == true) goto L8;
        r6 = 0;
    L8:
        r0.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", r6 | r3);
        return;
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public final void m6374(boolean r3) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.f10575.setScreenReaderFocusable(r3);
        return;
    L6:
        m6373(1, r3);
    }

    /* JADX INFO: renamed from: ʽ */
    public final ArrayList m6375(String r3) {
        AccessibilityNodeInfo r0 = this.f10575;
        ArrayList<Integer> r1 = r0.getExtras().getIntegerArrayList(r3);
        if (r1 != null) goto L6;
        ArrayList<Integer> r12 = new ArrayList();
        r0.getExtras().putIntegerArrayList(r3, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final void m6376(CharSequence r2) {
        this.f10575.setClassName(r2);
    }

    /* JADX INFO: renamed from: ˉʿ */
    public final void m6377(boolean r3) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.f10575.setHeading(r3);
        return;
    L6:
        m6373(2, r3);
    }

    /* JADX INFO: renamed from: ˉˆ */
    public final void m6378(CharSequence r4) {
        int r0 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo r2 = this.f10575;
        if (r0 < 28) goto L6;
        r2.setPaneTitle(r4);
        return;
    L6:
        r2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", r4);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean m6379(int r4) {
        Bundle r0 = this.f10575.getExtras();
        if (r0 != null) goto L6;
    L9:
        return false;
    L6:
        if ((r0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & r4) != r4) goto L9;
        return true;
    }

    /* JADX INFO: renamed from: יـ */
    public final void m6380(CharSequence r2) {
        this.f10575.setText(r2);
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public final void m6381(ﹳٴ r2) {
        this.f10575.setCollectionInfo(null);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final CharSequence m6382() {
        boolean r1 = m6375("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo r2 = this.f10575;
        if (r1 == true) goto L10;
        ArrayList r0 = m6375("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList r12 = m6375("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList r3 = m6375("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList r4 = m6375("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        int r8 = 0;
        SpannableString r5 = new SpannableString(TextUtils.substring(r2.getText(), 0, r2.getText().length()));
    L6:
        if (r8 >= r0.size()) goto L8;
        r5.setSpan(new C3021(((Integer) r4.get(r8)).intValue(), this, r2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) r0.get(r8)).intValue(), ((Integer) r12.get(r8)).intValue(), ((Integer) r3.get(r8)).intValue());
        r8 = r8 + 1;
        goto L6
    L8:
        return r5;
    L10:
        return r2.getText();
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public final void m6383(String r4) {
        int r0 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo r2 = this.f10575;
        if (r0 < 26) goto L6;
        r2.setHintText(r4);
        return;
    L6:
        r2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", r4);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final boolean m6384() {
        if (Build.VERSION.SDK_INT < 26) goto L7;
        return this.f10575.isShowingHintText();
    L7:
        return m6379(4);
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public final void m6385(boolean r2) {
        this.f10575.setScrollable(r2);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6386(C3009 r2) {
        AccessibilityNodeInfo.AccessibilityAction r22 = (AccessibilityNodeInfo.AccessibilityAction) r2.f10572;
        this.f10575.addAction(r22);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m6387(int r2) {
        this.f10575.addAction(r2);
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public final void m6388(boolean r3) {
        if (Build.VERSION.SDK_INT < 26) goto L6;
        this.f10575.setShowingHintText(r3);
        return;
    L6:
        m6373(4, r3);
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public final void m6389(C2135 r2) {
        AccessibilityNodeInfo.CollectionItemInfo r22 = (AccessibilityNodeInfo.CollectionItemInfo) r2.f7641;
        this.f10575.setCollectionItemInfo(r22);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m6390(Rect r2) {
        this.f10575.getBoundsInParent(r2);
    }
}
