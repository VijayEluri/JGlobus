/* Generated By:JavaCC: Do not edit this line. RSLParserTokenManager.java */
/*
 * Copyright 1999-2006 University of Chicago
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.globus.rsl;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class RSLParserTokenManager implements RSLParserConstants
{
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x8000L) != 0L)
            return 0;
         if ((active0 & 0x8L) != 0L)
            return 7;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         return jjStopAtPos(0, 2);
      case 10:
         return jjStopAtPos(0, 4);
      case 13:
         return jjStartNfaWithStates_0(0, 3, 7);
      case 32:
         return jjStopAtPos(0, 1);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 35:
         return jjStopAtPos(0, 27);
      case 36:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 38:
         return jjStopAtPos(0, 12);
      case 40:
         return jjStartNfaWithStates_0(0, 15, 0);
      case 41:
         return jjStopAtPos(0, 16);
      case 43:
         return jjStopAtPos(0, 14);
      case 60:
         jjmatchedKind = 10;
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 61:
         return jjStopAtPos(0, 6);
      case 62:
         jjmatchedKind = 8;
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 124:
         return jjStopAtPos(0, 13);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      case 61:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         else if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         else if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 111;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x8ffff420fffff9ffL & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                     jjCheckNAdd(7);
                  }
                  else if (curChar == 39)
                     jjCheckNAddStates(0, 4);
                  else if (curChar == 34)
                     jjCheckNAddStates(5, 9);
                  else if (curChar == 40)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if (curChar == 42)
                     jjCheckNAddStates(10, 12);
                  break;
               case 3:
                  if ((0xfffff9ffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(4, 2);
                  break;
               case 4:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(4, 2);
                  break;
               case 5:
                  if (curChar == 41 && kind > 5)
                     kind = 5;
                  break;
               case 7:
                  if ((0x8ffff420fffff9ffL & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(7);
                  break;
               case 37:
                  if (curChar == 34)
                     jjCheckNAddStates(5, 9);
                  break;
               case 39:
                  if (curChar == 34 && kind > 19)
                     kind = 19;
                  break;
               case 70:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 71:
                  if (curChar == 34)
                     jjCheckNAddStates(13, 15);
                  break;
               case 72:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 71;
                  break;
               case 73:
                  if (curChar == 34 && kind > 25)
                     kind = 25;
                  break;
               case 74:
                  if (curChar == 39)
                     jjCheckNAddStates(0, 4);
                  break;
               case 76:
                  if (curChar == 39 && kind > 20)
                     kind = 20;
                  break;
               case 107:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 108:
                  if (curChar == 39)
                     jjCheckNAddStates(16, 18);
                  break;
               case 109:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 108;
                  break;
               case 110:
                  if (curChar == 39 && kind > 26)
                     kind = 26;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0xefffffffbfffffffL & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                     jjCheckNAdd(7);
                  }
                  if ((0x4000000040000L & l) != 0L)
                     jjAddStates(19, 20);
                  break;
               case 1:
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
               case 4:
                  jjCheckNAddTwoStates(4, 2);
                  break;
               case 7:
                  if ((0xefffffffbfffffffL & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(7);
                  break;
               case 8:
                  if ((0x4000000040000L & l) != 0L)
                     jjAddStates(19, 20);
                  break;
               case 9:
                  if ((0x400000004000L & l) != 0L && kind > 18)
                     kind = 18;
                  break;
               case 10:
               case 24:
                  if ((0x800000008000L & l) != 0L)
                     jjCheckNAdd(9);
                  break;
               case 11:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 25:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 35:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 38:
               case 55:
                  if ((0x400000004000L & l) != 0L)
                     jjCheckNAdd(39);
                  break;
               case 40:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 41:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 45:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 49:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 48;
                  break;
               case 50:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 51:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 50;
                  break;
               case 52:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 53:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 52;
                  break;
               case 54:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 56:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 56;
                  break;
               case 58:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 57;
                  break;
               case 59:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 58;
                  break;
               case 60:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 61:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 61;
                  break;
               case 63:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 62;
                  break;
               case 64:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 63;
                  break;
               case 65:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 66:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 65;
                  break;
               case 67:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 68:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 69:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 68;
                  break;
               case 70:
                  jjAddStates(13, 15);
                  break;
               case 75:
               case 92:
                  if ((0x400000004000L & l) != 0L)
                     jjCheckNAdd(76);
                  break;
               case 77:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 75;
                  break;
               case 78:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 77;
                  break;
               case 79:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 78;
                  break;
               case 80:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 79;
                  break;
               case 81:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 80;
                  break;
               case 82:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 81;
                  break;
               case 83:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 82;
                  break;
               case 84:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 83;
                  break;
               case 85:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 84;
                  break;
               case 86:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 85;
                  break;
               case 87:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 86;
                  break;
               case 88:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 87;
                  break;
               case 89:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 88;
                  break;
               case 90:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 91:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 90;
                  break;
               case 93:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 92;
                  break;
               case 94:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 93;
                  break;
               case 95:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 94;
                  break;
               case 96:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 95;
                  break;
               case 97:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 96;
                  break;
               case 98:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 97;
                  break;
               case 99:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 100:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 99;
                  break;
               case 101:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 100;
                  break;
               case 102:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 101;
                  break;
               case 103:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 102;
                  break;
               case 104:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 103;
                  break;
               case 105:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 104;
                  break;
               case 106:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 105;
                  break;
               case 107:
                  jjAddStates(16, 18);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 6:
               case 7:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(7);
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(4, 2);
                  break;
               case 70:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(13, 15);
                  break;
               case 107:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(16, 18);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 111 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   91, 106, 107, 109, 110, 54, 69, 70, 72, 73, 2, 3, 5, 70, 72, 73,
   107, 109, 110, 23, 36,
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\75", "\41\75", "\76", "\76\75", "\74",
"\74\75", "\46", "\174", "\53", "\50", "\51", "\44\50", null, null, null, null, null,
null, null, null, null, "\43", };
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xf1fffc1L,
};
static final long[] jjtoSkip = {
   0x3eL,
};
static final long[] jjtoSpecial = {
   0x1eL,
};
private ASCII_CharStream input_stream;
private final int[] jjrounds = new int[111];
private final int[] jjstateSet = new int[222];
protected char curChar;
public RSLParserTokenManager(ASCII_CharStream stream)
{
   if (ASCII_CharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public RSLParserTokenManager(ASCII_CharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(ASCII_CharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 111; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(ASCII_CharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

private final Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public final Token getNextToken()
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
