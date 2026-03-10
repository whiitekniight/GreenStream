package p354;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p365.ActionProviderVisibilityListenerC4797;

/* JADX INFO: renamed from: ᵎˊ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC4749 extends MenuItem {
    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC4749 setContentDescription(CharSequence r1);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList r1);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode r1);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char r1, char r2, int r3, int r4);

    @Override // android.view.MenuItem
    InterfaceMenuItemC4749 setTooltipText(CharSequence r1);

    /* JADX INFO: renamed from: ⁱˊ */
    InterfaceMenuItemC4749 mo9363(ActionProviderVisibilityListenerC4797 r1);

    /* JADX INFO: renamed from: ﹳٴ */
    ActionProviderVisibilityListenerC4797 mo9364();
}
