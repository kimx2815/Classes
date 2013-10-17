
sum.o:     file format elf32-i386


Disassembly of section .text:

00000000 <sum>:
   0:	55                   	push   %ebp
   1:	89 e5                	mov    %esp,%ebp
   3:	83 ec 10             	sub    $0x10,%esp
   6:	8b 45 0c             	mov    0xc(%ebp),%eax
   9:	03 45 08             	add    0x8(%ebp),%eax
   c:	89 45 fc             	mov    %eax,-0x4(%ebp)
   f:	a1 00 00 00 00       	mov    0x0,%eax
  14:	03 45 fc             	add    -0x4(%ebp),%eax
  17:	a3 00 00 00 00       	mov    %eax,0x0
  1c:	8b 45 fc             	mov    -0x4(%ebp),%eax
  1f:	c9                   	leave  
  20:	c3                   	ret    
