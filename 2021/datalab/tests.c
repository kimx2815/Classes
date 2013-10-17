/* Testing Code */

#include <limits.h>
int test_tmin(void) {
  return INT_MIN;
}
int test_bitAnd(int x, int y)
{
  return x&y;
}
int test_bitOr(int x, int y)
{
  return x|y;
}
int test_isNotEqual(int x, int y)
{
  return x != y;
}
int test_getByte(int x, int n)
{
  union {
    int word;
    unsigned char bytes[4];
  } u;
  int test = 1;
  int littleEndian = (int) *(char *) &test;
  u.word = x;
  return littleEndian ? (unsigned) u.bytes[n] : (unsigned) u.bytes[3-n];
}






int test_fitsBits(int x, int n)
{
  int TMin_n = -(1 << (n-1));
  int TMax_n = (1 << (n-1)) - 1;
  return x >= TMin_n && x <= TMax_n;

}
int test_copyLSB(int x)
{
  return (x & 0x1) ? -1 : 0;
}
int test_isLessOrEqual(int x, int y)
{
  return x <= y;
}
int test_logicalShift(int x, int n) {
  unsigned u = (unsigned) x;
  unsigned shifted = u >> n;
  return (int) shifted;
}
int test_sum3(int x, int y, int z)
{
  return x+y+z;
}
int test_bitCount(int x) {
  int result = 0;
  int i;
  for (i = 0; i < 32; i++)
    result += (x >> i) & 0x1;
  return result;
}
int test_abs(int x) {
  return (x < 0) ? -x : x;
}
int test_bitParity(int x) {
  int result = 0;
  int i;
  for (i = 0; i < 32; i++)
    result ^= (x >> i) & 0x1;
  return result;
}
int test_sm2tc(int x) {
  int sign = x < 0;
  int mag = x & INT_MAX;
  return sign ? -mag : mag;
}
