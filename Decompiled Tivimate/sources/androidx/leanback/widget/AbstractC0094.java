package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import ar.tvplayer.p002tv.R;
import java.util.Random;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: androidx.leanback.widget.ʾˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0094 extends EditText {

    /* JADX INFO: renamed from: ˊʻ */
    public static final Pattern f862 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final C0098 f863 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public Bitmap f864;

    /* JADX INFO: renamed from: ʾˋ */
    public final Random f865;

    /* JADX INFO: renamed from: ˈٴ */
    public int f866;

    /* JADX INFO: renamed from: ᴵˊ */
    public Bitmap f867;

    /* JADX INFO: renamed from: ᴵᵔ */
    public ObjectAnimator f868;

    static {
        f862 = Pattern.compile("\\S+");
        Class<Integer> r3 = Integer.class;
        f863 = new C0098(r3, "streamPosition", 3);
    }

    public AbstractC0094(Context r2, AttributeSet r3) {
        super(r2, r3, R.style.u);
        this.f865 = new Random();
    }

    public int getStreamPosition() {
        return this.f866;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f867 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.u), (int) (r0.getWidth() * 1.3f), (int) (r0.getHeight() * 1.3f), false);
        this.f864 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.u), (int) (r0.getWidth() * 1.3f), (int) (r0.getHeight() * 1.3f), false);
        this.f866 = -1;
        ObjectAnimator r0 = this.f868;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        setText("");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName("androidx.leanback.widget.StreamingTextView");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(ﹳٴ.ﹳٴ.ˉـ(r1, this));
    }

    public void setStreamPosition(int r1) {
        this.f866 = r1;
        invalidate();
    }
}
