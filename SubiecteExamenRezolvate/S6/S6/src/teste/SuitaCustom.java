package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ TestCalculTotalPuncte.class, TestSetPunctajMaxim.class })
@IncludeCategory({CategorieCustom.class})
public class SuitaCustom {

}
