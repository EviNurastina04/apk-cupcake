// Generated by data binding compiler. Do not edit!
package com.example.cupcake.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.cupcake.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSummaryBinding extends ViewDataBinding {
  @NonNull
  public final TextView date;

  @NonNull
  public final View divider1;

  @NonNull
  public final View divider2;

  @NonNull
  public final View divider3;

  @NonNull
  public final TextView flavor;

  @NonNull
  public final TextView flavorLabel;

  @NonNull
  public final TextView pickupLabel;

  @NonNull
  public final TextView quantity;

  @NonNull
  public final TextView quantityLabel;

  @NonNull
  public final Button sendButton;

  @NonNull
  public final TextView total;

  protected FragmentSummaryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView date, View divider1, View divider2, View divider3, TextView flavor,
      TextView flavorLabel, TextView pickupLabel, TextView quantity, TextView quantityLabel,
      Button sendButton, TextView total) {
    super(_bindingComponent, _root, _localFieldCount);
    this.date = date;
    this.divider1 = divider1;
    this.divider2 = divider2;
    this.divider3 = divider3;
    this.flavor = flavor;
    this.flavorLabel = flavorLabel;
    this.pickupLabel = pickupLabel;
    this.quantity = quantity;
    this.quantityLabel = quantityLabel;
    this.sendButton = sendButton;
    this.total = total;
  }

  @NonNull
  public static FragmentSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_summary, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSummaryBinding>inflateInternal(inflater, R.layout.fragment_summary, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSummaryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_summary, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSummaryBinding>inflateInternal(inflater, R.layout.fragment_summary, null, false, component);
  }

  public static FragmentSummaryBinding bind(@NonNull View view) {
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
  public static FragmentSummaryBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSummaryBinding)bind(component, view, R.layout.fragment_summary);
  }
}
