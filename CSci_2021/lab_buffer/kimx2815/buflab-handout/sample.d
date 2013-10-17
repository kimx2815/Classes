
sample.o:     file format elf32-i386


Disassembly of section .text:

00000000 <.text>:
   0:	68 54 1d ac 25       	push   $0x25ac1d54
   5:	68 ed 8b 04 08       	push   $0x8048bed
   a:	55                   	push   %ebp
   b:	89 e5                	mov    %esp,%ebp
   d:	8b 45 08             	mov    0x8(%ebp),%eax
  10:	a3 20 d1 04 08       	mov    %eax,0x804d120
  15:	89 ec                	mov    %ebp,%esp
  17:	5d                   	pop    %ebp
  18:	c3                   	ret    
