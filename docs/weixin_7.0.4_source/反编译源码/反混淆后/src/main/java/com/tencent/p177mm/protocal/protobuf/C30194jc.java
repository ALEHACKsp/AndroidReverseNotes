package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.jc */
public final class C30194jc extends btd {
    public long rUb;
    public LinkedList<bql> vKY = new LinkedList();

    public C30194jc() {
        AppMethodBeat.m2504i(108892);
        AppMethodBeat.m2505o(108892);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(108893);
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            c6093a.mo13472ai(2, this.rUb);
            c6093a.mo13474e(3, 8, this.vKY);
            AppMethodBeat.m2505o(108893);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int o = (ix + C6091a.m9578o(2, this.rUb)) + C6087a.m9552c(3, 8, this.vKY);
            AppMethodBeat.m2505o(108893);
            return o;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vKY.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(108893);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C30194jc c30194jc = (C30194jc) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c30194jc.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(108893);
                    return 0;
                case 2:
                    c30194jc.rUb = c6086a2.BTU.mo13459ve();
                    AppMethodBeat.m2505o(108893);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bql bql = new bql();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bql.populateBuilderWithField(c6086a3, bql, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c30194jc.vKY.add(bql);
                    }
                    AppMethodBeat.m2505o(108893);
                    return 0;
                default:
                    AppMethodBeat.m2505o(108893);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(108893);
            return -1;
        }
    }
}
