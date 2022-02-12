# Examples for Kotlin Presentation: "Smarter Types with Data Classes"

A type defines a set of values. Historically we haven't been very good at using
encapsulation to ensure that objects stay within that set of values. This
code-focused presentation provides a functional approach to Kotlin type design,
using Kotlin's `data class` to guarantee that each constructed object is a
legal value. Your code improves dramatically because now you validate the object
in one place, at construction. When `data class` fields are `val`s, an object 
cannot be morphed into an illegal value. A typed object
never needs to be re-checked by any function that receives it as an argument.
