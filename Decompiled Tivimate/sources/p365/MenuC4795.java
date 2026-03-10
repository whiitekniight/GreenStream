package p365;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p040.AbstractC1599;
import p198.AbstractC3311;

/* JADX INFO: renamed from: ᵔʾ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public class MenuC4795 implements Menu {

    /* JADX INFO: renamed from: ʼʼ */
    public static final int[] f16891 = null;

    /* JADX INFO: renamed from: ʻٴ */
    public C4812 f16892;

    /* JADX INFO: renamed from: ʼˎ */
    public final ArrayList f16893;

    /* JADX INFO: renamed from: ʼᐧ */
    public boolean f16894;

    /* JADX INFO: renamed from: ʽ */
    public boolean f16895;

    /* JADX INFO: renamed from: ʽﹳ */
    public final CopyOnWriteArrayList f16896;

    /* JADX INFO: renamed from: ʾᵎ */
    public boolean f16897;

    /* JADX INFO: renamed from: ˆʾ */
    public final ArrayList f16898;

    /* JADX INFO: renamed from: ˈ */
    public final boolean f16899;

    /* JADX INFO: renamed from: ˉʿ */
    public CharSequence f16900;

    /* JADX INFO: renamed from: ˉˆ */
    public View f16901;

    /* JADX INFO: renamed from: ˏי */
    public final ArrayList f16902;

    /* JADX INFO: renamed from: ˑﹳ */
    public InterfaceC4806 f16903;

    /* JADX INFO: renamed from: יـ */
    public boolean f16904;

    /* JADX INFO: renamed from: ـˆ */
    public boolean f16905;

    /* JADX INFO: renamed from: ٴﹶ */
    public boolean f16906;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final ArrayList f16907;

    /* JADX INFO: renamed from: ᵔʾ */
    public Drawable f16908;

    /* JADX INFO: renamed from: ᵔᵢ */
    public boolean f16909;

    /* JADX INFO: renamed from: ᵔﹳ */
    public boolean f16910;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Resources f16911;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Context f16912;

    /* JADX INFO: renamed from: ﹳᐧ */
    public boolean f16913;

    /* JADX INFO: renamed from: ﾞʻ */
    public int f16914;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final ArrayList f16915;

    static {
        f16891 = new int[]{1, 4, 5, 3, 2, 0};
    }

    public MenuC4795(Context r6) {
        boolean r0 = false;
        this.f16914 = 0;
        this.f16894 = false;
        this.f16910 = false;
        this.f16913 = false;
        this.f16904 = false;
        this.f16902 = new ArrayList();
        this.f16896 = new CopyOnWriteArrayList();
        this.f16905 = false;
        this.f16912 = r6;
        Resources r1 = r6.getResources();
        this.f16911 = r1;
        this.f16915 = new ArrayList();
        this.f16907 = new ArrayList();
        this.f16909 = true;
        this.f16893 = new ArrayList();
        this.f16898 = new ArrayList();
        this.f16906 = true;
        if (r1.getConfiguration().keyboard == 1) goto L15;
        ViewConfiguration r12 = ViewConfiguration.get(r6);
        Method r3 = AbstractC3311.f11554;
        if (Build.VERSION.SDK_INT < 28) goto L7;
        boolean r62 = AbstractC1599.m4240(r12);
    L13:
        if (r62 == false) goto L15;
        r0 = true;
        goto L15
    L7:
        Resources r63 = r6.getResources();
        int r13 = r63.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if (r13 != 0) goto L10;
    L12:
        r62 = false;
        goto L13
    L10:
        if (r63.getBoolean(r13) == false) goto L12;
        r62 = true;
    L15:
        this.f16899 = r0;
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2) {
        return m9447(0, 0, 0, this.f16911.getString(r2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, int r5) {
        return m9447(r2, r3, r4, this.f16911.getString(r5));
    }

    @Override // android.view.Menu
    public final MenuItem add(int r1, int r2, int r3, CharSequence r4) {
        return m9447(r1, r2, r3, r4);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence r2) {
        return m9447(0, 0, 0, r2);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r8, int r9, int r10, ComponentName r11, Intent[] r12, Intent r13, int r14, MenuItem[] r15) {
        PackageManager r0 = this.f16912.getPackageManager();
        int r1 = 0;
        List<ResolveInfo> r112 = r0.queryIntentActivityOptions(r11, r12, r13, 0);
        if (r112 == null) goto L5;
        int r2 = r112.size();
    L7:
        if ((r14 & 1) != 0) goto L9;
        removeGroup(r8);
    L9:
        if (r1 >= r2) goto L20;
        ResolveInfo r142 = r112.get(r1);
        int r4 = r142.specificIndex;
        if (r4 >= 0) goto L13;
        Intent r42 = r13;
    L14:
        Intent r3 = new Intent(r42);
        ActivityInfo r5 = r142.activityInfo;
        r3.setComponent(new ComponentName(r5.applicationInfo.packageName, r5.name));
        C4812 r43 = m9447(r8, r9, r10, r142.loadLabel(r0));
        r43.setIcon(r142.loadIcon(r0));
        r43.f17028 = r3;
        if (r15 == null) goto L19;
        int r143 = r142.specificIndex;
        if (r143 < 0) goto L19;
        r15[r143] = r43;
    L19:
        r1 = r1 + 1;
        goto L9
    L13:
        r42 = r12[r4];
        goto L14
    L20:
        return r2;
    L5:
        r2 = 0;
        goto L7
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2) {
        return addSubMenu(0, 0, 0, this.f16911.getString(r2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return addSubMenu(r2, r3, r4, this.f16911.getString(r5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r1, int r2, int r3, CharSequence r4) {
        C4812 r12 = m9447(r1, r2, r3, r4);
        SubMenuC4793 r22 = new SubMenuC4793(this.f16912, this, r12);
        r12.f17021 = r22;
        r22.setHeaderTitle(r12.f17023);
        return r22;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence r2) {
        return addSubMenu(0, 0, 0, r2);
    }

    @Override // android.view.Menu
    public final void clear() {
        C4812 r0 = this.f16892;
        if (r0 == null) goto L5;
        mo9428(r0);
    L5:
        this.f16915.clear();
        m9437(true);
    }

    public final void clearHeader() {
        this.f16908 = null;
        this.f16900 = null;
        this.f16901 = null;
        m9437(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m9438(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r6) {
        ArrayList r0 = this.f16915;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L13;
        C4812 r3 = (C4812) r0.get(r2);
        if (r3.f17034 == r6) goto L6;
        if (r3.hasSubMenu() == false) goto L12;
        MenuItem r32 = r3.f17021.findItem(r6);
        if (r32 == null) goto L12;
        return r32;
    L12:
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L13:
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r2) {
        return (MenuItem) this.f16915.get(r2);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f16897 == true) goto L9;
        ArrayList r0 = this.f16915;
        int r1 = r0.size();
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L12;
        if (((C4812) r0.get(r3)).isVisible() == true) goto L15;
        r3 = r3 + 1;
        goto L6
    L15:
        return true;
    L12:
        return false;
    L9:
        return true;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r1, KeyEvent r2) {
        if (m9443(r1, r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r2, int r3) {
        return m9445(findItem(r2), null, r3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r1, KeyEvent r2, int r3) {
        C4812 r12 = m9443(r1, r2);
        if (r12 == null) goto L5;
        boolean r13 = m9445(r12, null, r3);
    L7:
        if ((r3 & 2) == 0) goto L9;
        m9438(true);
    L9:
        return r13;
    L5:
        r13 = false;
        goto L7
    }

    @Override // android.view.Menu
    public final void removeGroup(int r6) {
        ArrayList r0 = this.f16915;
        int r1 = r0.size();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (((C4812) r0.get(r3)).f17033 == r6) goto L9;
        r3 = r3 + 1;
    L9:
        if (r3 < 0) goto L30;
        int r12 = r0.size() - r3;
    L11:
        int r4 = r2 + 1;
        if (r2 >= r12) goto L21;
        if (((C4812) r0.get(r3)).f17033 != r6) goto L21;
        if (r3 < 0) goto L20;
        if (r3 >= r0.size()) goto L20;
        r0.remove(r3);
    L20:
        r2 = r4;
    L21:
        m9437(true);
        return;
    L30:
        return;
    L8:
        r3 = -1;
        goto L9
    }

    @Override // android.view.Menu
    public final void removeItem(int r5) {
        ArrayList r0 = this.f16915;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        if (((C4812) r0.get(r2)).f17034 == r5) goto L9;
        r2 = r2 + 1;
    L9:
        if (r2 >= 0) goto L11;
        return;
    L11:
        if (r2 >= r0.size()) goto L18;
        r0.remove(r2);
        m9437(true);
        return;
    L18:
        return;
    L8:
        r2 = -1;
        goto L9
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r8, boolean r9, boolean r10) {
        ArrayList r0 = this.f16915;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L12;
        C4812 r4 = (C4812) r0.get(r3);
        if (r4.f17033 != r8) goto L11;
        int r5 = r4.f17017 & (-5);
        if (r10 == false) goto L9;
        int r6 = 4;
    L10:
        r4.f17017 = r5 | r6;
        r4.setCheckable(r9);
        goto L11
    L9:
        r6 = 0;
    L11:
        r3 = r3 + 1;
        goto L3
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
        this.f16905 = r1;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r6, boolean r7) {
        ArrayList r0 = this.f16915;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        C4812 r3 = (C4812) r0.get(r2);
        if (r3.f17033 != r6) goto L7;
        r3.setEnabled(r7);
    L7:
        r2 = r2 + 1;
        goto L3
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r11, boolean r12) {
        ArrayList r0 = this.f16915;
        int r1 = r0.size();
        int r3 = 0;
        boolean r4 = false;
    L4:
        if (r3 >= r1) goto L15;
        C4812 r6 = (C4812) r0.get(r3);
        if (r6.f17033 != r11) goto L14;
        int r7 = r6.f17017;
        int r8 = r7 & (-9);
        if (r12 == false) goto L10;
        int r9 = 0;
    L11:
        int r82 = r8 | r9;
        r6.f17017 = r82;
        if (r7 == r82) goto L14;
        r4 = true;
        goto L14
    L10:
        r9 = 8;
    L14:
        r3 = r3 + 1;
        goto L4
    L15:
        if (r4 == false) goto L22;
        m9437(true);
        return;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
        this.f16895 = r1;
        m9437(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f16915.size();
    }

    /* JADX INFO: renamed from: ʻٴ */
    public final void m9435() {
        this.f16894 = false;
        if (this.f16910 == false) goto L6;
        this.f16910 = false;
        m9437(this.f16913);
        return;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final void m9436() {
        ArrayList r0 = m9449();
        if (this.f16906 == true) goto L5;
        return;
    L5:
        CopyOnWriteArrayList r1 = this.f16896;
        Iterator r2 = r1.iterator();
        boolean r4 = false;
    L7:
        if (r2.hasNext() == false) goto L12;
        WeakReference r5 = (WeakReference) r2.next();
        InterfaceC4792 r6 = (InterfaceC4792) r5.get();
        if (r6 == null) goto L10;
        r4 = r4 | r6.mo6065();
        goto L7
    L10:
        r1.remove(r5);
        goto L7
    L12:
        ArrayList r12 = this.f16893;
        ArrayList r22 = this.f16898;
        if (r4 == false) goto L21;
        r12.clear();
        r22.clear();
        int r42 = r0.size();
        int r52 = 0;
    L15:
        if (r52 >= r42) goto L22;
        C4812 r62 = (C4812) r0.get(r52);
        if ((r62.f17017 & 32) != 32) goto L19;
        r12.add(r62);
    L20:
        r52 = r52 + 1;
        goto L15
    L19:
        r22.add(r62);
    L22:
        this.f16906 = false;
        return;
    L21:
        r12.clear();
        r22.clear();
        r22.addAll(m9449());
        goto L22
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public final void m9437(boolean r4) {
        if (this.f16894 == true) goto L18;
        if (r4 == false) goto L6;
        this.f16909 = true;
        this.f16906 = true;
    L6:
        CopyOnWriteArrayList r42 = this.f16896;
        if (r42.isEmpty() == true) goto L29;
        m9442();
        Iterator r0 = r42.iterator();
    L11:
        if (r0.hasNext() == false) goto L16;
        WeakReference r1 = (WeakReference) r0.next();
        InterfaceC4792 r2 = (InterfaceC4792) r1.get();
        if (r2 == null) goto L14;
        r2.mo6066();
        goto L11
    L14:
        r42.remove(r1);
        goto L11
    L16:
        m9435();
        return;
    L29:
        return;
    L18:
        this.f16910 = true;
        if (r4 == false) goto L28;
        this.f16913 = true;
        return;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m9438(boolean r5) {
        if (this.f16904 == false) goto L5;
        return;
    L5:
        this.f16904 = true;
        CopyOnWriteArrayList r0 = this.f16896;
        Iterator r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L12;
        WeakReference r2 = (WeakReference) r1.next();
        InterfaceC4792 r3 = (InterfaceC4792) r2.get();
        if (r3 == null) goto L10;
        r3.mo6064(this, r5);
        goto L7
    L10:
        r0.remove(r2);
        goto L7
    L12:
        this.f16904 = false;
    }

    /* JADX INFO: renamed from: ʽﹳ */
    public final void m9439(int r2, CharSequence r3, int r4, Drawable r5, View r6) {
        if (r6 == null) goto L5;
        this.f16901 = r6;
        this.f16900 = null;
        this.f16908 = null;
    L14:
        m9437(false);
        return;
    L5:
        if (r2 <= 0) goto L7;
        this.f16900 = this.f16911.getText(r2);
    L9:
        if (r4 <= 0) goto L11;
        this.f16908 = this.f16912.getDrawable(r4);
    L13:
        this.f16901 = null;
        goto L14
    L11:
        if (r5 == null) goto L13;
        this.f16908 = r5;
        goto L13
    L7:
        if (r3 == null) goto L9;
        this.f16900 = r3;
        goto L9
    }

    /* JADX INFO: renamed from: ˆʾ */
    public String mo9427() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: ˈ */
    public boolean mo9428(C4812 r6) {
        CopyOnWriteArrayList r0 = this.f16896;
        boolean r2 = false;
        if (r0.isEmpty() == false) goto L5;
    L18:
        return r2;
    L5:
        if (this.f16892 != r6) goto L18;
        m9442();
        Iterator r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L15;
        WeakReference r3 = (WeakReference) r1.next();
        InterfaceC4792 r4 = (InterfaceC4792) r3.get();
        if (r4 == null) goto L12;
        r2 = r4.mo6067(r6);
        if (r2 == false) goto L9;
    L12:
        r0.remove(r3);
    L15:
        m9435();
        if (r2 == false) goto L18;
        this.f16892 = null;
        goto L18
    }

    /* JADX INFO: renamed from: ˉʿ */
    public boolean mo9429() {
        return this.f16905;
    }

    /* JADX INFO: renamed from: ˉˆ */
    public boolean mo9430() {
        return this.f16899;
    }

    /* JADX INFO: renamed from: ˏי */
    public final void m9440(Bundle r8) {
        int r0 = this.f16915.size();
        SparseArray<? extends Parcelable> r1 = null;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L17;
        MenuItem r3 = getItem(r2);
        View r4 = r3.getActionView();
        if (r4 == null) goto L14;
        if (r4.getId() == (-1)) goto L14;
        if (r1 != null) goto L10;
        r1 = new SparseArray();
    L10:
        r4.saveHierarchyState(r1);
        if (r3.isActionViewExpanded() == false) goto L14;
        r8.putInt("android:menu:expandedactionview", r3.getItemId());
    L14:
        if (r3.hasSubMenu() == false) goto L16;
        ((SubMenuC4793) r3.getSubMenu()).m9440(r8);
    L16:
        r2 = r2 + 1;
        goto L3
    L17:
        if (r1 == null) goto L23;
        r8.putSparseParcelableArray(mo9427(), r1);
        return;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public boolean mo9431(MenuC4795 r2, MenuItem r3) {
        InterfaceC4806 r0 = this.f16903;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.mo5925(r2, r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: יـ */
    public final void m9441(Bundle r8) {
        if (r8 == null) goto L26;
        SparseArray<Parcelable> r0 = r8.getSparseParcelableArray(mo9427());
        int r1 = this.f16915.size();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L15;
        MenuItem r3 = getItem(r2);
        View r4 = r3.getActionView();
        if (r4 == null) goto L12;
        if (r4.getId() == (-1)) goto L12;
        r4.restoreHierarchyState(r0);
    L12:
        if (r3.hasSubMenu() == false) goto L14;
        ((SubMenuC4793) r3.getSubMenu()).m9441(r8);
    L14:
        r2 = r2 + 1;
        goto L5
    L15:
        int r82 = r8.getInt("android:menu:expandedactionview");
        if (r82 <= 0) goto L24;
        MenuItem r83 = findItem(r82);
        if (r83 == null) goto L25;
        r83.expandActionView();
        return;
    L25:
        return;
    L24:
        return;
    }

    /* JADX INFO: renamed from: ـˆ */
    public final void m9442() {
        if (this.f16894 == true) goto L6;
        this.f16894 = true;
        this.f16910 = false;
        this.f16913 = false;
        return;
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public MenuC4795 mo9432() {
        return this;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final C4812 m9443(int r12, KeyEvent r13) {
        ArrayList r0 = this.f16902;
        r0.clear();
        m9444(r0, r12, r13);
        if (r0.isEmpty() == false) goto L5;
        return null;
    L5:
        int r1 = r13.getMetaState();
        KeyCharacterMap.KeyData r3 = new KeyCharacterMap.KeyData();
        r13.getKeyData(r3);
        int r132 = r0.size();
        if (r132 == 1) goto L8;
        boolean r4 = mo9433();
        int r6 = 0;
    L10:
        if (r6 >= r132) goto L30;
        C4812 r7 = (C4812) r0.get(r6);
        if (r4 == false) goto L14;
        char r8 = r7.f17018;
    L15:
        char[] r9 = r3.meta;
        if (r8 != r9[0]) goto L20;
        if ((r1 & 2) != 0) goto L20;
    L28:
        return r7;
    L20:
        if (r8 == r9[2]) goto L22;
    L23:
        if (r4 == false) goto L29;
        if (r8 != '\b') goto L29;
        if (r12 == 67) goto L28;
    L29:
        r6 = r6 + 1;
        goto L10
    L22:
        if ((r1 & 2) != 0) goto L28;
    L14:
        r8 = r7.f17030;
        goto L15
    L30:
        return null;
    L8:
        return (C4812) r0.get(0);
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public boolean mo9433() {
        return this.f16895;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final void m9444(List r18, int r19, KeyEvent r20) {
        boolean r3 = mo9433();
        int r4 = r20.getModifiers();
        KeyCharacterMap.KeyData r5 = new KeyCharacterMap.KeyData();
        if (r20.getKeyData(r5) == true) goto L6;
        if (r19 == 67) goto L6;
        return;
    L6:
        ArrayList r8 = this.f16915;
        int r9 = r8.size();
        int r11 = 0;
    L7:
        if (r11 >= r9) goto L41;
        C4812 r12 = (C4812) r8.get(r11);
        if (r12.hasSubMenu() == false) goto L11;
        r12.f17021.m9444(r18, r19, r20);
    L11:
        if (r3 == false) goto L13;
        char r13 = r12.f17018;
    L14:
        if (r3 == false) goto L16;
        int r14 = r12.f17026;
    L18:
        if ((r4 & 69647) != (r14 & 69647)) goto L31;
        if (r13 == 0) goto L31;
        char[] r10 = r5.meta;
        if (r13 == r10[0]) goto L29;
        if (r13 == r10[2]) goto L29;
        if (r3 == false) goto L31;
        if (r13 != '\b') goto L31;
        if (r19 != 67) goto L31;
    L29:
        if (r12.isEnabled() == false) goto L31;
        r18.add(r12);
    L31:
        r11 = r11 + 1;
        goto L7
    L16:
        r14 = r12.f17011;
        goto L18
    L13:
        r13 = r12.f17030;
        goto L14
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public final boolean m9445(MenuItem r7, InterfaceC4792 r8, int r9) {
        C4812 r72 = (C4812) r7;
        boolean r0 = false;
        if (r72 != null) goto L5;
    L71:
        return false;
    L5:
        if (r72.isEnabled() == false) goto L71;
        MenuC4795 r1 = r72.f17029;
        MenuItem.OnMenuItemClickListener r2 = r72.f17012;
        if (r2 == null) goto L13;
        if (r2.onMenuItemClick(r72) == false) goto L13;
    L11:
        boolean r12 = true;
    L27:
        ActionProviderVisibilityListenerC4797 r22 = r72.f17016;
        if (r22 != null) goto L30;
    L32:
        boolean r4 = false;
    L34:
        if (r72.m9472() == false) goto L39;
        r12 = r12 | r72.expandActionView();
        if (r12 == false) goto L70;
        m9438(true);
    L70:
        return r12;
    L39:
        if (r72.hasSubMenu() == true) goto L46;
        if (r4 == true) goto L46;
        if ((r9 & 1) != 0) goto L70;
        m9438(true);
    L46:
        if ((r9 & 4) != 0) goto L49;
        m9438(false);
    L49:
        if (r72.hasSubMenu() == true) goto L51;
        SubMenuC4793 r92 = new SubMenuC4793(this.f16912, this, r72);
        r72.f17021 = r92;
        r92.setHeaderTitle(r72.f17023);
    L51:
        SubMenuC4793 r73 = r72.f17021;
        if (r4 == false) goto L54;
        r22.f16942.onPrepareSubMenu(r73);
    L54:
        CopyOnWriteArrayList r93 = this.f16896;
        if (r93.isEmpty() == true) goto L67;
        if (r8 == null) goto L59;
        r0 = r8.mo6068(r73);
    L59:
        Iterator r82 = r93.iterator();
    L61:
        if (r82.hasNext() == false) goto L67;
        WeakReference r23 = (WeakReference) r82.next();
        InterfaceC4792 r42 = (InterfaceC4792) r23.get();
        if (r42 == null) goto L64;
        if (r0 == true) goto L61;
        r0 = r42.mo6068(r73);
        goto L61
    L64:
        r93.remove(r23);
    L67:
        r12 = r12 | r0;
        if (r12 == true) goto L70;
        m9438(true);
        goto L70
    L30:
        if (r22.f16942.hasSubMenu() == false) goto L32;
        r4 = true;
    L13:
        if (r1.mo9431(r1, r72) == true) goto L11;
        Intent r24 = r72.f17028;
        if (r24 != null) goto L72;
    L21:
        ActionProviderVisibilityListenerC4797 r13 = r72.f17016;
        if (r13 != null) goto L24;
    L26:
        r12 = false;
        goto L27
    L24:
        if (r13.f16942.onPerformDefaultAction() == false) goto L26;
    L72:
        r1.f16912.startActivity(r24);     // Catch: ActivityNotFoundException -> L19
        goto L11
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m9446(InterfaceC4792 r3, Context r4) {
        WeakReference r0 = new WeakReference(r3);
        this.f16896.add(r0);
        r3.mo6063(r4, this);
        this.f16906 = true;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4812 m9447(int r11, int r12, int r13, CharSequence r14) {
        int r0 = ((-65536) & r13) >> 16;
        if (r0 < 0) goto L16;
        if (r0 >= 6) goto L16;
        int r7 = (f16891[r0] << 16) | (65535 & r13);
        C4812 r2 = new C4812(this, r11, r12, r13, r7, r14, this.f16914);
        ArrayList r112 = this.f16915;
        int r122 = r112.size() - 1;
    L7:
        if (r122 < 0) goto L12;
        if (((C4812) r112.get(r122)).f17019 <= r7) goto L10;
        r122 = r122 - 1;
        goto L7
    L10:
        int r123 = r122 + 1;
    L13:
        r112.add(r123, r2);
        m9437(true);
        return r2;
    L12:
        r123 = 0;
    L16:
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public final void m9448(InterfaceC4792 r5) {
        CopyOnWriteArrayList r0 = this.f16896;
        Iterator r1 = r0.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        WeakReference r2 = (WeakReference) r1.next();
        InterfaceC4792 r3 = (InterfaceC4792) r2.get();
        if (r3 == null) goto L8;
        if (r3 != r5) goto L4;
    L8:
        r0.remove(r2);
        goto L4
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public final ArrayList m9449() {
        boolean r0 = this.f16909;
        ArrayList r1 = this.f16907;
        if (r0 == true) goto L5;
        return r1;
    L5:
        r1.clear();
        ArrayList r02 = this.f16915;
        int r2 = r02.size();
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L11;
        C4812 r5 = (C4812) r02.get(r4);
        if (r5.isVisible() == false) goto L10;
        r1.add(r5);
    L10:
        r4 = r4 + 1;
        goto L6
    L11:
        this.f16909 = false;
        this.f16906 = true;
        return r1;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public boolean mo9434(C4812 r6) {
        CopyOnWriteArrayList r0 = this.f16896;
        boolean r2 = false;
        if (r0.isEmpty() == false) goto L5;
        return false;
    L5:
        m9442();
        Iterator r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L13;
        WeakReference r3 = (WeakReference) r1.next();
        InterfaceC4792 r4 = (InterfaceC4792) r3.get();
        if (r4 == null) goto L10;
        r2 = r4.mo6069(r6);
        if (r2 == false) goto L7;
    L10:
        r0.remove(r3);
    L13:
        m9435();
        if (r2 == false) goto L16;
        this.f16892 = r6;
    L16:
        return r2;
    }
}
