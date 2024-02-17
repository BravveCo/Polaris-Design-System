package com.digitalhorizons.core.hyperlink

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.developer.design.system.core.R
import com.developer.design.system.core.databinding.HyperlinkViewBinding


internal class HyperLink @kotlin.jvm.JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private val binding = HyperlinkViewBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        context.obtainStyledAttributes(
            attrs,
            R.styleable.HyperLink,
            defStyleAttr,
            R.style.HyperLink
        ).also(::setup).recycle()
    }

    private fun setup(typedArray: TypedArray) = with(typedArray) {


    }


}