	.file	"sum.c"
.globl accum
	.bss
	.align 4
	.type	accum, @object
	.size	accum, 4
accum:
	.zero	4
	.text
.globl sum
	.type	sum, @function
sum:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$16, %esp
	movl	12(%ebp), %eax
	addl	8(%ebp), %eax
	movl	%eax, -4(%ebp)
	movl	accum, %eax
	addl	-4(%ebp), %eax
	movl	%eax, accum
	movl	-4(%ebp), %eax
	leave
	ret
	.size	sum, .-sum
	.ident	"GCC: (GNU) 4.2.3"
	.section	.note.GNU-stack,"",@progbits
