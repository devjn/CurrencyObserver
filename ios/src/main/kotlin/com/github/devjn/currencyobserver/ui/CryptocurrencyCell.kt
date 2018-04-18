package com.github.devjn.currencyobserver.ui


import apple.NSObject
import apple.coregraphics.struct.CGRect
import apple.foundation.NSArray
import apple.foundation.NSCoder
import apple.foundation.NSDate
import apple.foundation.NSMethodSignature
import apple.foundation.NSSet
import apple.uikit.*
import org.moe.natj.c.ann.FunctionPtr
import org.moe.natj.c.ann.Variadic
import org.moe.natj.general.NatJ
import org.moe.natj.general.Pointer
import org.moe.natj.general.ann.*
import org.moe.natj.general.ptr.VoidPtr
import org.moe.natj.objc.Class
import org.moe.natj.objc.ObjCRuntime
import org.moe.natj.objc.SEL
import org.moe.natj.objc.ann.*
import org.moe.natj.objc.map.ObjCObjectMapper

@Runtime(ObjCRuntime::class)
@ObjCClassName("CryptocurrencyCell")
@RegisterOnStartup
class CryptocurrencyCell protected constructor(peer: Pointer) : UITableViewCell(peer) {

    @Generated
    @ProtocolClassMethod("appearance")
    @MappedReturn(ObjCObjectMapper::class)
    override fun _appearance(): Any {
        return appearance()
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    @MappedReturn(ObjCObjectMapper::class)
    override fun _appearanceForTraitCollection(trait: UITraitCollection): Any {
        return appearanceForTraitCollection(trait)
    }

    @Generated
    @Deprecated("")
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper::class)
    override fun _appearanceForTraitCollectionWhenContainedIn(
            trait: UITraitCollection,
            @Mapped(ObjCObjectMapper::class) ContainerClass: Any,
            vararg varargs: Any): Any {
        return appearanceForTraitCollectionWhenContainedIn(trait,
                ContainerClass, *varargs)
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper::class)
    override fun _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            trait: UITraitCollection, containerTypes: NSArray<*>): Any {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
                trait, containerTypes)
    }

    @Generated
    @Deprecated("")
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper::class)
    override fun _appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper::class) ContainerClass: Any,
            vararg varargs: Any): Any {
        return appearanceWhenContainedIn(ContainerClass, *varargs)
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper::class)
    override fun _appearanceWhenContainedInInstancesOfClasses(
            containerTypes: NSArray<*>): Any {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes)
    }

    @Generated
    @Selector("iconImage")
    external fun iconImage(): UIImageView?

    @Generated
    @Selector("init")
    override external fun init(): CryptocurrencyCell

    @Generated
    @Selector("initWithCoder:")
    override external fun initWithCoder(aDecoder: NSCoder): CryptocurrencyCell

    @Generated
    @Selector("initWithFrame:")
    override external fun initWithFrame(@ByValue frame: CGRect): CryptocurrencyCell

    @Generated
    @Deprecated("")
    @Selector("initWithFrame:reuseIdentifier:")
    override external fun initWithFrameReuseIdentifier(
            @ByValue frame: CGRect, reuseIdentifier: String): CryptocurrencyCell

    @Generated
    @Selector("initWithStyle:reuseIdentifier:")
    override external fun initWithStyleReuseIdentifier(
            @NInt style: Long, reuseIdentifier: String): CryptocurrencyCell

    @Generated
    @Selector("priceText")
    external fun priceText(): UITextView?

    @Generated
    @Selector("setIconImage:")
    external fun setIconImage_unsafe(value: UIImageView?)

    @Generated
    fun setIconImage(value: UIImageView?) {
        val __old = iconImage()
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value)
        }
        setIconImage_unsafe(value)
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old)
        }
    }

    @Generated
    @Selector("setPriceText:")
    external fun setPriceText_unsafe(value: UITextView?)

    @Generated
    fun setPriceText(value: UITextView?) {
        val __old = priceText()
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value)
        }
        setPriceText_unsafe(value)
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old)
        }
    }

    @Generated
    @Selector("setTitleText:")
    external fun setTitleText_unsafe(value: UITextView?)

    @Generated
    fun setTitleText(value: UITextView?) {
        val __old = titleText()
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value)
        }
        setTitleText_unsafe(value)
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old)
        }
    }

    @Generated
    @Selector("titleText")
    external fun titleText(): UITextView?

    companion object {
        init {
            NatJ.register()
        }

        @Generated
        @Selector("accessInstanceVariablesDirectly")
        external fun accessInstanceVariablesDirectly(): Boolean

        @Generated
        @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
        external fun addKeyframeWithRelativeStartTimeRelativeDurationAnimations(
                frameStartTime: Double,
                frameDuration: Double,
                @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") animations: UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations)

        @Generated
        @Owned
        @Selector("alloc")
        external fun alloc(): CryptocurrencyCell

        @Generated
        @Selector("allocWithZone:")
        @MappedReturn(ObjCObjectMapper::class)
        external fun allocWithZone(zone: VoidPtr): Any

        @Generated
        @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
        external fun animateKeyframesWithDurationDelayOptionsAnimationsCompletion(
                duration: Double,
                delay: Double,
                @NUInt options: Long,
                @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") animations: UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3,
                @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") completion: UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4)

        @Generated
        @Selector("animateWithDuration:animations:")
        external fun animateWithDurationAnimations(
                duration: Double,
                @ObjCBlock(name = "call_animateWithDurationAnimations") animations: UIView.Block_animateWithDurationAnimations)

        @Generated
        @Selector("animateWithDuration:animations:completion:")
        external fun animateWithDurationAnimationsCompletion(
                duration: Double,
                @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") animations: UIView.Block_animateWithDurationAnimationsCompletion_1,
                @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") completion: UIView.Block_animateWithDurationAnimationsCompletion_2)

        @Generated
        @Selector("animateWithDuration:delay:options:animations:completion:")
        external fun animateWithDurationDelayOptionsAnimationsCompletion(
                duration: Double,
                delay: Double,
                @NUInt options: Long,
                @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") animations: UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3,
                @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") completion: UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4)

        @Generated
        @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
        external fun animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
                duration: Double,
                delay: Double,
                @NFloat dampingRatio: Double,
                @NFloat velocity: Double,
                @NUInt options: Long,
                @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") animations: UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5,
                @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") completion: UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6)

        @Generated
        @Selector("appearance")
        @MappedReturn(ObjCObjectMapper::class)
        external fun appearance(): Any

        @Generated
        @Selector("appearanceForTraitCollection:")
        @MappedReturn(ObjCObjectMapper::class)
        external fun appearanceForTraitCollection(
                trait: UITraitCollection): Any

        @Generated
        @Variadic
        @Deprecated("")
        @Selector("appearanceForTraitCollection:whenContainedIn:")
        @MappedReturn(ObjCObjectMapper::class)
        external fun appearanceForTraitCollectionWhenContainedIn(
                trait: UITraitCollection,
                @Mapped(ObjCObjectMapper::class) ContainerClass: Any,
                vararg varargs: Any): Any

        @Generated
        @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
        @MappedReturn(ObjCObjectMapper::class)
        external fun appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
                trait: UITraitCollection, containerTypes: NSArray<*>): Any

        @Generated
        @Variadic
        @Deprecated("")
        @Selector("appearanceWhenContainedIn:")
        @MappedReturn(ObjCObjectMapper::class)
        external fun appearanceWhenContainedIn(
                @Mapped(ObjCObjectMapper::class) ContainerClass: Any,
                vararg varargs: Any): Any

        @Generated
        @Selector("appearanceWhenContainedInInstancesOfClasses:")
        @MappedReturn(ObjCObjectMapper::class)
        external fun appearanceWhenContainedInInstancesOfClasses(
                containerTypes: NSArray<*>): Any

        @Generated
        @Selector("areAnimationsEnabled")
        external fun areAnimationsEnabled(): Boolean

        @Generated
        @Selector("automaticallyNotifiesObserversForKey:")
        external fun automaticallyNotifiesObserversForKey(key: String): Boolean

        @Generated
        @Selector("beginAnimations:context:")
        external fun beginAnimationsContext(animationID: String,
                                            context: VoidPtr)

        @Generated
        @Selector("cancelPreviousPerformRequestsWithTarget:")
        external fun cancelPreviousPerformRequestsWithTarget(
                @Mapped(ObjCObjectMapper::class) aTarget: Any)

        @Generated
        @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
        external fun cancelPreviousPerformRequestsWithTargetSelectorObject(
                @Mapped(ObjCObjectMapper::class) aTarget: Any, aSelector: SEL,
                @Mapped(ObjCObjectMapper::class) anArgument: Any)

        @Generated
        @Selector("classFallbacksForKeyedArchiver")
        external fun classFallbacksForKeyedArchiver(): NSArray<String>

        @Generated
        @Selector("classForKeyedUnarchiver")
        external fun classForKeyedUnarchiver(): Class

        @Generated
        @Selector("clearTextInputContextIdentifier:")
        external fun clearTextInputContextIdentifier(identifier: String)

        @Generated
        @Selector("commitAnimations")
        external fun commitAnimations()

        @Generated
        @Selector("debugDescription")
        external fun debugDescription_static(): String

        @Generated
        @Selector("description")
        external fun description_static(): String

        @Generated
        @Selector("hash")
        @NUInt
        external fun hash_static(): Long

        @Generated
        @Selector("inheritedAnimationDuration")
        external fun inheritedAnimationDuration(): Double

        @Generated
        @Selector("instanceMethodForSelector:")
        @FunctionPtr(name = "call_instanceMethodForSelector_ret")
        external fun instanceMethodForSelector(
                aSelector: SEL): NSObject.Function_instanceMethodForSelector_ret

        @Generated
        @Selector("instanceMethodSignatureForSelector:")
        external fun instanceMethodSignatureForSelector(
                aSelector: SEL): NSMethodSignature

        @Generated
        @Selector("instancesRespondToSelector:")
        external fun instancesRespondToSelector(aSelector: SEL): Boolean

        @Generated
        @Selector("isSubclassOfClass:")
        external fun isSubclassOfClass(aClass: Class): Boolean

        @Generated
        @Selector("keyPathsForValuesAffectingValueForKey:")
        external fun keyPathsForValuesAffectingValueForKey(
                key: String): NSSet<String>

        @Generated
        @Selector("layerClass")
        external fun layerClass(): Class

        @Generated
        @Owned
        @Selector("new")
        @MappedReturn(ObjCObjectMapper::class)
        external fun new_objc(): Any

        @Generated
        @Selector("performSystemAnimation:onViews:options:animations:completion:")
        external fun performSystemAnimationOnViewsOptionsAnimationsCompletion(
                @NUInt animation: Long,
                views: NSArray<out UIView>,
                @NUInt options: Long,
                @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") parallelAnimations: UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3,
                @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") completion: UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4)

        @Generated
        @Selector("performWithoutAnimation:")
        external fun performWithoutAnimation(
                @ObjCBlock(name = "call_performWithoutAnimation") actionsWithoutAnimation: UIView.Block_performWithoutAnimation)

        @Generated
        @Selector("requiresConstraintBasedLayout")
        external fun requiresConstraintBasedLayout(): Boolean

        @Generated
        @Selector("resolveClassMethod:")
        external fun resolveClassMethod(sel: SEL): Boolean

        @Generated
        @Selector("resolveInstanceMethod:")
        external fun resolveInstanceMethod(sel: SEL): Boolean

        @Generated
        @Selector("setAnimationBeginsFromCurrentState:")
        external fun setAnimationBeginsFromCurrentState(
                fromCurrentState: Boolean)

        @Generated
        @Selector("setAnimationCurve:")
        external fun setAnimationCurve(@NInt curve: Long)

        @Generated
        @Selector("setAnimationDelay:")
        external fun setAnimationDelay(delay: Double)

        @Generated
        @Selector("setAnimationDelegate:")
        external fun setAnimationDelegate(
                @Mapped(ObjCObjectMapper::class) delegate: Any)

        @Generated
        @Selector("setAnimationDidStopSelector:")
        external fun setAnimationDidStopSelector(selector: SEL)

        @Generated
        @Selector("setAnimationDuration:")
        external fun setAnimationDuration_static(duration: Double)

        @Generated
        @Selector("setAnimationRepeatAutoreverses:")
        external fun setAnimationRepeatAutoreverses(
                repeatAutoreverses: Boolean)

        @Generated
        @Selector("setAnimationRepeatCount:")
        external fun setAnimationRepeatCount_static(repeatCount: Float)

        @Generated
        @Selector("setAnimationStartDate:")
        external fun setAnimationStartDate(startDate: NSDate)

        @Generated
        @Selector("setAnimationTransition:forView:cache:")
        external fun setAnimationTransitionForViewCache(
                @NInt transition: Long, view: UIView, cache: Boolean)

        @Generated
        @Selector("setAnimationWillStartSelector:")
        external fun setAnimationWillStartSelector(selector: SEL)

        @Generated
        @Selector("setAnimationsEnabled:")
        external fun setAnimationsEnabled(enabled: Boolean)

        @Generated
        @Selector("setVersion:")
        external fun setVersion(@NInt aVersion: Long)

        @Generated
        @Selector("superclass")
        external fun superclass_static(): Class

        @Generated
        @Selector("transitionFromView:toView:duration:options:completion:")
        external fun transitionFromViewToViewDurationOptionsCompletion(
                fromView: UIView,
                toView: UIView,
                duration: Double,
                @NUInt options: Long,
                @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") completion: UIView.Block_transitionFromViewToViewDurationOptionsCompletion)

        @Generated
        @Selector("transitionWithView:duration:options:animations:completion:")
        external fun transitionWithViewDurationOptionsAnimationsCompletion(
                view: UIView,
                duration: Double,
                @NUInt options: Long,
                @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") animations: UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3,
                @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") completion: UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4)

        @Generated
        @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
        @NInt
        external fun userInterfaceLayoutDirectionForSemanticContentAttribute(
                @NInt attribute: Long): Long

        @Generated
        @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
        @NInt
        external fun userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
                @NInt semanticContentAttribute: Long, @NInt layoutDirection: Long): Long

        @Generated
        @Selector("version")
        @NInt
        external fun version_static(): Long
    }
}