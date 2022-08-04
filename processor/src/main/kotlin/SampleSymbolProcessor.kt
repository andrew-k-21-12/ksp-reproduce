import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.KSAnnotated

class SampleSymbolProcessor : SymbolProcessor {

    class Provider : SymbolProcessorProvider {

        override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor = SampleSymbolProcessor()

    }

    override fun process(resolver: Resolver): List<KSAnnotated> = emptyList()

}
