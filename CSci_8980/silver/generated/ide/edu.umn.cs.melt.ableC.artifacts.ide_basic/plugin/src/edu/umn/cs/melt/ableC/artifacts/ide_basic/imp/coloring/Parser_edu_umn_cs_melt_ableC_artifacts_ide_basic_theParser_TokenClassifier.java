package edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.coloring;

import java.util.HashMap;
import java.util.Map;

import edu.umn.cs.melt.ide.copper.coloring.ICopperTokenClassifier;

public class Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TokenClassifier implements ICopperTokenClassifier {
	private static Map<String, Integer> map = new HashMap<String, Integer>();
	
	public final static class TokenType {
		
		public static final int DEFAULT = 0;
		
		
		public static final int TOTAL = 1;
	}
	
	static{
		map.put("edu_umn_cs_melt_ableC_concretesyntax_ADD_ASSIGN", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_AND_ASSIGN", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_AddMulLeft_NEVER_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_AddMulNone_NEVER_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_AddMulRight_NEVER_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_AndOp_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_And_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Assign_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Auto_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_BREAK", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_BlockComment", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_comments);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Bool_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_CASE", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_CONTINUE", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_CharLiteral_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Char_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Colon_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Comma_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Complex_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Const_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Constant_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Cpp_Attribute_high_prec", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_DEC_OP", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_DEFAULT", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_DIV_ASSIGN", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_DO", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_DecimalConstant_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Divide_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Dot_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Double_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_ELLIPSES", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_ELSE", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_ENUM", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Equality_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Extern_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_FOR", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_FloatConstant_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Float_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_GOTO", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_GreaterThanEqual_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_GreaterThan_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_HexFloatConst_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_IF", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_INC_OP", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Identifier_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Imagin_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Inline_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Int_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_LBracket_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_LCurly_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_LEFT_ASSIGN", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_LEFT_OP", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_LParen_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_LessThanEqual_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_LessThan_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_LineComment", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_comments);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Long_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_MOD_ASSIGN", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_MUL_ASSIGN", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Minus_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Mod_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_NonEquality_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Not_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_OR_ASSIGN", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_OrOp_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Or_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_PTR_OP", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Plus_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Question_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_RBracket_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_RCurly_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_RIGHT_ASSIGN", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_RIGHT_OP", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_RParen_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Register_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Restrict_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Return_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_SIZEOF", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_STRUCT", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_SUB_ASSIGN", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_SWITCH", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Semi_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Short_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Signed_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Star_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Static_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_StringLiteral_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Tilde_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_TypeName_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Typedef_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_UNION", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Unsigned_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Void_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Volatile_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_WHILE", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_WhiteSpace", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_comments);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_XOR_ASSIGN", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_equal);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_Xor_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_special_symbol);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_c11_C11_AlignAs_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_c11_C11_Alignof_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_c11_C11_Atomic_LParen_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_c11_C11_Atomic_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_c11_C11_Generic_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_c11_C11_Noreturn_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_c11_C11_Static_assert_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_c11_C11_Thread_local_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_cppTags_CPP_Location_Tag_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_cppTags_Hash_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_cppTags_Space_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_Asm_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_Asm_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_Attr_LowerPrec_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_Attribute_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_Extension_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_Inline_OneSided_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_Inline_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_Signed_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_Typeof_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_UUAsm_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_UUAttribute_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_UUTypeof_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_UUVolatile_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_CPP_Volatile_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_GNU_AlignOfUU_T", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_GNU_AlignOf_T", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_GNU_BuiltinOffsetof_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_GNU_BuiltinTypesCompatible_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_GNU_BuiltinVaArg_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_GNU_UUImagUU_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_GNU_UUImag_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_GNU_UULabel_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_GNU_UURealUU_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_GNU_UUReal_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_ImaginaryFloatConstant_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_ImaginaryHexFloatConst_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_Pack_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_PragmaMark", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_comments);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_Pragma_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_RedefExtname_t", TokenType.DEFAULT);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_Typeof_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_UUBuiltinVAList_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_UUConst_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_UURestrictUU_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
			map.put("edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_UURestrict_t", TokenType.edu_umn_cs_melt_ableC_concretesyntax_font_all);
	}
	
	@Override
	public int getKind(String symbolName) {
		if(symbolName==null || "".equals(symbolName)){
			return TokenType.DEFAULT;
		}
		
		Integer kind = map.get(symbolName);
		
		if(kind==null){
			return TokenType.DEFAULT;
		}
		
		return kind;
	}
	
	private static Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TokenClassifier INSTANCE = new Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TokenClassifier();
	
	public static Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TokenClassifier getInstance(){
		return INSTANCE;
	}
	
	private Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TokenClassifier(){
	
	}

}
