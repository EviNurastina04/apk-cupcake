// Generated by data binding compiler. Do not edit!
package com.example.cupcake.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.cupcake.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentFlavorBinding extends ViewDataBinding {
  @NonNull
  public final RadioButton chocolate;

  @NonNull
  public final RadioButton coffee;

  @NonNull
  public final View divider;

  @NonNull
  public final RadioGroup flavorOptions;

  @NonNull
  public final Button nextButton;

  @NonNull
  public final RadioButton redVelvet;

  @NonNull
  public final RadioButton saltedCaramel;

  @NonNull
  public final TextView subtotal;

  @NonNull
  public final RadioButton vanilla;

  protected FragmentFlavorBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RadioButton chocolate, RadioButton coffee, View divider, RadioGroup flavorOptions,
      Button nextButton, RadioButton redVelvet, RadioButton saltedCaramel, TextView subtotal,
      RadioButton vanilla) {
    super(_bindingComponent, _root, _localFieldCount);
    this.chocolate = chocolate;
    this.coffee = coffee;
    this.divider = divider;
    this.flavorOptions = flavorOptions;
    this.nextButton = nextButton;
    this.redVelvet = redVelvet;
    this.saltedCaramel = saltedCaramel;
    this.subtotal = subtotal;
    this.vanilla = vanilla;
  }

  @NonNull
  public static FragmentFlavorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_flavor, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFlavorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFlavorBinding>inflateInternal(inflater, R.layout.fragment_flavor, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFlavorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_flavor, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFlavorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFlavorBinding>inflateInternal(inflater, R.layout.fragment_flavor, null, false, component);
  }

  public static FragmentFlavorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentFlavorBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFlavorBinding)bind(component, view, R.layout.fragment_flavor);
  }
}
