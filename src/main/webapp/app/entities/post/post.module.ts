import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { DtotestSharedModule } from '../../shared';
import {
    PostService,
    PostPopupService,
    PostComponent,
    PostDetailComponent,
    PostDialogComponent,
    PostPopupComponent,
    PostDeletePopupComponent,
    PostDeleteDialogComponent,
    postRoute,
    postPopupRoute,
    PostResolvePagingParams,
} from './';

const ENTITY_STATES = [
    ...postRoute,
    ...postPopupRoute,
];

@NgModule({
    imports: [
        DtotestSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        PostComponent,
        PostDetailComponent,
        PostDialogComponent,
        PostDeleteDialogComponent,
        PostPopupComponent,
        PostDeletePopupComponent,
    ],
    entryComponents: [
        PostComponent,
        PostDialogComponent,
        PostPopupComponent,
        PostDeleteDialogComponent,
        PostDeletePopupComponent,
    ],
    providers: [
        PostService,
        PostPopupService,
        PostResolvePagingParams,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class DtotestPostModule {}
