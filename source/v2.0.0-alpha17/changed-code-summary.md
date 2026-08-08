# v2.0.0-alpha17 changed-code summary

Primary Android source changes are in `MainActivity.java` and `CrashGuardApplication.java`, plus the manifest/build version bump.

- Replaced Splitter Undo's touch-start snapshot with staged `beginSliderGesture` / `commitSliderGesture` state. Only a genuine range change replaces the previous Undo point.
- Touch cancellation after horizontal dragging reaches the same range-change completion path.
- Changed Divider mode's selected default from 60 to 90 seconds.
- Added visible labels/explanations to Splitter Settings numeric fields.
- Added local aggregate usage counters and a user-reviewed usage-report dialog in Diagnostics.
- Extended CrashGuardApplication so a newly captured uncaught crash is marked for a next-launch prompt; MainActivity provides send/keep/discard and Diagnostics access.
- Expanded Help into a complete task guide.
- Expanded About with support email/website actions.

The app does not automatically transmit analytics or crash information; reporting requires explicit user action.
