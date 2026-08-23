// ============================================
// اليوم 2 — أساسيات Kotlin
// ============================================

// --------------------------------------------
// 1. val vs var
// --------------------------------------------
// val = قيمة ثابتة، مينفعش تتغيّر بعد التعريف
// var = متغيّر، ممكن تتغيّر قيمته وقت ما تحب
//
// القاعدة: ابدأ دايمًا بـ val، وحوّلها لـ var بس لو فعلاً محتاج تغيّرها

val studentName = "أحمد"      // ثابت، لأن الاسم مش هيتغيّر
var studentScore = 75         // متغيّر، لأن الدرجة ممكن تتحدّث

// ⚠️ ملحوظة: لو حاولت تغيّر val هتاخد error: "Val cannot be reassigned"


// --------------------------------------------
// 2. أنواع البيانات (Data Types)
// --------------------------------------------
// مش لازم تكتب النوع، Kotlin بتكتشفه لوحدها (Type Inference)
// لكن لو عايز تكتبه صراحة: val name: String = "..."

val name: String = "سارة"
val age: Int = 20
val average: Double = 87.5
val isPassed: Boolean = true

// ⚠️ خطأ شائع (جاي من Dart): النوع في Kotlin بيبدأ بحرف كبير
// خطأ: int, double, bool
// صح:  Int, Double, Boolean


// --------------------------------------------
// 3. قوالب السلسلة النصية (String Templates)
// --------------------------------------------
// بدل ما توصل النصوص بـ +، بتحط $ قبل اسم المتغير مباشرة
// ولو تعبير كامل (مش بس متغير) بتحطه جوه ${ }

val student = "منى"
val grade = 90
println("الطالبة $student درجتها $grade")
println("عدد حروف اسمها هو: ${student.length}")


// --------------------------------------------
// 4. if / when
// --------------------------------------------
// if في Kotlin ممكن "ترجع قيمة" مباشرة (زي ternary في Dart)
// when هي بديل switch، ومش محتاجة break بعد كل حالة

fun getGrade(score: Int): String {
    return when {
        score >= 90 -> "ممتاز"
        score >= 75 -> "جيد جدًا"
        score >= 50 -> "مقبول"
        else -> "راسب"
    }
}

println("تقييم الطالب: ${getGrade(85)}")   // جيد جدًا

// ⚠️ ملحوظة: when بتوقف عند أول شرط يتحقق، ترتيب الشروط مهم جدًا


// --------------------------------------------
// 5. حلقات التكرار (for / while)
// --------------------------------------------
// for بتستخدم in دايمًا، مالهاش صياغة (i=0; i<10; i++) التقليدية

val classmates = listOf("علي", "ليلى", "عمر")

for (classmate in classmates) {
    println("الطالب: $classmate")
}

// for على أرقام (Range)
for (i in 1..5) println(i)          // شامل الرقم الأخير
for (i in 1 until 5) println(i)     // بدون الرقم الأخير
for (i in 5 downTo 1) println(i)    // تنازلي

// while — بيفضل يكرر طالما الشرط صح
var counter = 0
while (counter < classmates.size) {
    println(classmates[counter])
    counter++
}

// ⚠️ خطأ شائع وقعت فيه: تنسى تعرّف المتغير بـ var قبل while
// ⚠️ خطأ شائع تاني: تحط الشرط معكوس (> بدل <) فالحلقة متشتغلش خالص


// --------------------------------------------
// 6. Lists / Arrays / Maps
// --------------------------------------------
// List: قائمة مرتبة بأرقام (index)، ممكن ثابتة (listOf) أو قابلة للتعديل (mutableListOf)
// Array: زي List بس حجمها ثابت من الإنشاء
// Map: مفتاح ➜ قيمة، مفيهاش ترتيب أرقام

val students = listOf("أحمد", "علي", "مها", "مهاب")
val scores = listOf(90, 40, 55, 87)

// ربط طالب بدرجته باستخدام index
for (i in students.indices) {
    println("${students[i]} = ${scores[i]}")
}

// نفس الفكرة لكن بـ Map (أنضف لو العلاقة واحد-لواحد)
val results = mapOf("أحمد" to 90, "علي" to 40)
for ((student, score) in results) {
    println("$student = $score")
}

// ⚠️ ملحوظة: println(array) بتطبع عنوان ذاكرة غريب، استخدم array.joinToString()


// --------------------------------------------
// 7. Null Safety
// --------------------------------------------
// String  = المتغير ده مستحيل يبقى فاضي (null)
// String? = المتغير ده ممكن يبقى فاضي

var studentEmail: String? = null   // بعض الطلبة معندهمش إيميل مسجل

// ?. Safe Call: نفّذ العملية بس لو القيمة مش فاضية
println(studentEmail?.length)      // null، مش كرش

// ?: Elvis Operator: لو فاضي، استخدم قيمة بديلة
val displayEmail = studentEmail ?: "غير مسجل"
println(displayEmail)

// !! Not-null assertion: "أنا متأكد إنها مش فاضية" (خطير، تجنبها قدر الإمكان)
studentEmail = "ahmed@school.com"
println(studentEmail!!.length)

// ⚠️ ملحوظة مهمة: !! لو غلطت فيها والقيمة فعلاً null، البرنامج بيكرش فورًا
// نفس مشكلة NullPointerException بتاعة Java اللي Kotlin أساسًا بتحاول تتجنبها


// ============================================
// ملاحظات عامة (Tips) من اليوم
// ============================================
// 1. Kotlin بتكتشف النوع لوحدها غالبًا، مش لازم تكتبه كل مرة
// 2. اتعودت من Dart على: ?., ??, String? — نفس الفكرة في Kotlin
//    لكن Kotlin بتستخدم ?: بدل ??
// 3. for في Kotlin أقوى من Dart: فيها step, downTo, until جاهزين
// 4. when أنضف بكتير من switch، ومش محتاجة break
