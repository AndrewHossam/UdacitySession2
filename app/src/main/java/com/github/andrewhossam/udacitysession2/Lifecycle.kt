package com.github.andrewhossam.udacitysession2

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import timber.log.Timber

object Lifecycle {

    val activityLifecycle = object : Application.ActivityLifecycleCallbacks {
        override fun onActivityCreated(activity: Activity, p1: Bundle?) {
            Timber.i("${activity.javaClass.simpleName} : OnCreate")

            (activity as AppCompatActivity).supportFragmentManager.registerFragmentLifecycleCallbacks(
                callbacks,
                true
            )
        }

        override fun onActivityStarted(activity: Activity) {
            Timber.i("${activity.javaClass.simpleName} : OnStarted")
        }

        override fun onActivityResumed(activity: Activity) {
            Timber.i("${activity.javaClass.simpleName} : OnResumed")
        }

        override fun onActivityPaused(activity: Activity) {
            Timber.i("${activity.javaClass.simpleName} : OnPaused")
        }

        override fun onActivityStopped(activity: Activity) {
            Timber.i("${activity.javaClass.simpleName} : OnStopped")
        }

        override fun onActivitySaveInstanceState(activity: Activity, p1: Bundle) {
            Timber.i("${activity.javaClass.simpleName} : OnSaveInstanceState")
        }

        override fun onActivityDestroyed(activity: Activity) {
            Timber.i("${activity.javaClass.simpleName} : OnDestroyed")
        }

    }

    private val callbacks = object : FragmentManager.FragmentLifecycleCallbacks() {
        override fun onFragmentPreAttached(
            fm: FragmentManager,
            f: Fragment,
            context: Context,
        ) {
            Timber.i("${f.javaClass.simpleName} : onFragmentPreAttached")
        }

        override fun onFragmentAttached(
            fm: FragmentManager,
            f: Fragment,
            context: Context,
        ) {
            Timber.i("${f.javaClass.simpleName} : onFragmentAttached")
        }

        override fun onFragmentPreCreated(
            fm: FragmentManager,
            f: Fragment,
            savedInstanceState: Bundle?,
        ) {
            Timber.i("${f.javaClass.simpleName} : onFragmentPreCreated")
        }

        override fun onFragmentCreated(
            fm: FragmentManager,
            f: Fragment,
            savedInstanceState: Bundle?,
        ) {
            Timber.i("${f.javaClass.simpleName} : onFragmentCreated")
        }

        override fun onFragmentActivityCreated(
            fm: FragmentManager,
            f: Fragment,
            savedInstanceState: Bundle?,
        ) {
            Timber.i("${f.javaClass.simpleName} : onFragmentActivityCreated")
        }

        override fun onFragmentViewCreated(
            fm: FragmentManager,
            f: Fragment,
            v: View,
            savedInstanceState: Bundle?,
        ) {
            Timber.i("${f.javaClass.simpleName} : onFragmentViewCreated")
        }

        override fun onFragmentStarted(fm: FragmentManager, f: Fragment) {
            Timber.i("${f.javaClass.simpleName} : onFragmentStarted")
        }

        override fun onFragmentResumed(fm: FragmentManager, f: Fragment) {
            Timber.i("${f.javaClass.simpleName} : onFragmentResumed")
        }

        override fun onFragmentPaused(fm: FragmentManager, f: Fragment) {
            Timber.i("${f.javaClass.simpleName} : onFragmentPaused")
        }

        override fun onFragmentStopped(fm: FragmentManager, f: Fragment) {
            Timber.i("${f.javaClass.simpleName} : onFragmentStopped")
        }

        override fun onFragmentSaveInstanceState(
            fm: FragmentManager,
            f: Fragment,
            outState: Bundle,
        ) {
            Timber.i("${f.javaClass.simpleName} : onFragmentSaveInstanceState")
        }

        override fun onFragmentViewDestroyed(fm: FragmentManager, f: Fragment) {
            Timber.i("${f.javaClass.simpleName} : onFragmentViewDestroyed")
        }

        override fun onFragmentDestroyed(fm: FragmentManager, f: Fragment) {
            Timber.i("${f.javaClass.simpleName} : onFragmentDestroyed")
        }

        override fun onFragmentDetached(fm: FragmentManager, f: Fragment) {
            Timber.i("${f.javaClass.simpleName} : onFragmentDetached")
        }
    }
}