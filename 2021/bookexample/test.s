	.file	"test.c"
	.section	.rodata
.LC0:
	.string	"a=%d"
	.text
.globl test
	.type	test, @function
test:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$24, %esp
	movl	$10, -4(%ebp)
	movl	-4(%ebp), %eax
	movl	%eax, 4(%esp)
	movl	$.LC0, (%esp)
	call	printf
	leave
	ret
	.size	test, .-test
	.ident	"GCC: (GNU) 4.2.3"
	.section	.note.GNU-stack,"",@progbits
